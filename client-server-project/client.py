#Client.py

import socket, sys

print("Client Starting \n")
print("Getting user strings \n")
fd = socket.socket(socket.AF_INET, socket.SOCK_DGRAM )
udp_ip = '127.0.0.1' #ip to connect to
udp_port = 8000 #port to connect to


    
# get User Strings
str1 = str(input("Enter the first string: ")) # convert to string in case a user enters a number
str2 = str(input("Enter the second string: "))
str3 = str(input("Enter the third string: "))

if (str1 == "" or str2 == "" or str3 == ""): #if there are any null strings then the program will exit
        print("You did not enter a string")
        sys.exit(0)
        
strLen = len(str1 + str2 + str3) #get the string length
fullStr = str1 + str2 + str3 #get the concatenation of the 3 strings

newrepStr = "" #this will be the full returned string from the server
newrepStrLen = "" #this will be the length of thr returned split string from the server

print(f"Full String: {fullStr}")
print("String Length: " + str(strLen) + "\n")
# sendStr = str1 + "#" + str2 + "#" + str3 + "#"

print("Sending strings")
fd.sendto(bytes(str1, 'utf-8'), (udp_ip, udp_port)) # 
print(f"Sending string 1: {str1}")
fd.sendto(bytes(str2, 'utf-8'), (udp_ip, udp_port)) # 
print(f"Sending string 2: {str2}")
fd.sendto(bytes(str3, 'utf-8'), (udp_ip, udp_port)) # 
print(f"Sending string 3: {str3}")


while(True):
    try:
        
        reply = fd.recvfrom(1000) #store the reply data
        if "END_STRING :" in str(reply[0], 'utf-8'): #use a flag to seperate the return string
            repStr = str(reply[0], 'utf-8')
            newrepStr = repStr.split(":") #remove the flag
            cleanedRepStr = newrepStr[1].replace("#", "") #removed all hashes
            print("New Part from Server: " + newrepStr[1])
            if (fullStr == cleanedRepStr): #Compare the two strings
                print(f"Entered String: {fullStr} \t Returned String: {cleanedRepStr}")
                print("They match! ")
            else:
                print("They don't match ")
            
        if "STRING_LEN :" in str(reply[0], 'utf-8'): #str length flag
            repStr = str(reply[0], 'utf-8')
            newrepLen = repStr.split(":") #remove the flag
            print("New Length: " + newrepLen[1])
            if(strLen == int(newrepLen[1])):
                print(f"Entered String Length: {strLen} \t Returned String Length: {newrepLen[1]}") #compare the two string lengths
                print("Strings are both " + str(strLen) + " chars long!")
            else:
                print("They don't match ")
                
        #print("Server: " + reply.decode('utf-8')) #whole tuple (b'hello world', ('127.0.0.1', 8014))
        print("Server: " + str(reply[0], 'utf-8')) #print out all messages from the server
    except KeyboardInterrupt:
        sys.exit()
        
print("Client Closing")

