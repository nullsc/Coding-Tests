#Server.py

import socket, sys

print("Server Starting \n")

print("Awaiting packets from the client \n")

counter = 0 # counts the incoming packets
str1 = ""
str2 = ""
str3 = ""
strArr = ["", "", ""] # to store the incoming packets
newStr = "" #new strings concatenated

udp_ip = '127.0.0.1' #connecting ip
udp_port = 8000 #listening port

fd = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
fd.bind((udp_ip,udp_port))
while True: #keep receiving
    try:
        r = fd.recvfrom(1000) #store the received data in r
        client_address = r[1] #this stores the client ip & port so we can send data back

        
        if (counter <= 2): # means the array is full with 3 elements
            strArr[counter] = (str(r[0], 'utf-8')) #fill each part of the array
            print("Array = " + str(strArr)) # prints out the array ['net', 'wor', 'king']
            counter += 1 # increment 1 after putting into array
        
        if (strArr[2] is not ""):
            print("Array full")
            newStr = strArr[0] + "#" + strArr[1] + "#" + strArr[2] #concatonate strings & add hashes
            print(newStr)
            fd.sendto(bytes("END_STRING :" + newStr, 'utf-8'), client_address) # send data back (hashes removed by client)
            
            returnLen = len(strArr[0] + strArr[1] + strArr[2]) # get str len & send data back
            fd.sendto(bytes("STRING_LEN :" + str(returnLen) , 'utf-8'), client_address) # send data back & add STRING_LEN flag so we can differentiate it from the string
        
        

        print("Client : %s"%(str(r[0], 'utf-8'))) #shows what data the client sent
        print(f"Packet number: {counter}") #doesn't increase past 3
        
        if ("" not in strArr): #checks if the array is full
            counter = 0 # restart the counter
            strArr = ["", "", ""] #resest the array, now we can start again
        
        # reply = input('Server : ') # test to send data back using input

        # fd.sendto(bytes(reply, 'utf-8'), client_address) # send data back
    except KeyboardInterrupt:
        fd.close() #close the socket
        sys.exit()
        

print("Server Closing")

