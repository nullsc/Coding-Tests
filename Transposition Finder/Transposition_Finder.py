#15/11/2019

#for example 123 = 3
#could be 1*3 = 3

charset = ('1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '+', '-', '*', '/') #tuple as static

def test_sum(sum, ans):
    '''Function used to test if a sum works or not'''
    #eval("+*3") for example will throw a syntax error so need to use try
    try:
        if((eval(sum)) == int(ans)):
            #print("yes")
            return True
        else:
            #print("no")
            return False
    except: #do nothing
        pass

def brute(sumStr):
    '''cycles through each character in the set to find a combo that works'''
    print("Bruting")
    #need to put the test here, if it works then no need to brute
    #also need to print which keys are switched
    sumStr = sumStr.replace(" ", "").split("=") #remove white space and split the string
    firstP = sumStr[0] #before the = sign
    answerP = sumStr[1] # after the = sign
    print("Trying {}={}". format(firstP, answerP))

    ansArray = list(firstP)
    print(ansArray)
    tempAns = []
    swappedKeys = []

    if(test_sum(str(sumStr), answerP) == True): #doesn't work correctly for some reason
        print(str(sumStr), "Already works")
        return 1 #exit as the sum already works

    for x in range(0, len(ansArray)):
    #have to make a copy of the string that you can use each time
    #otherwise the last digit stays as the last char in the set (/)

        tempAns.append(ansArray[x]) #add the last char to array
        for y in range(0, len(charset)):
            ansArray[x] = charset[y]
            ntemp3 = "".join(ansArray) #list to str conversion

            if(test_sum(str(ntemp3), answerP) == True): #need to convert the list to a str
                print(ansArray, "works!")
                print(list(set(firstP) - set(ansArray)))
                print(list(set(ansArray) - set(firstP)))
                
                swappedKeys.append(list(set(firstP) - set(ansArray)))
                swappedKeys.append(list(set(ansArray) - set(firstP)))
                keys = ",".join(map(str, swappedKeys))
                print("Swapped Keys: " + keys)

            if(y == len(charset) - 1): #if we are at the end of the charset
                ansArray[x] = tempAns[x]
        

def main():
    print("Broken Calculator Test")
    #brute("123 = 3")
    brute("1951 = 18")


if __name__ == "__main__":
    main()
