#Make a function that will take a string and randomly switch two characters in the string,
#it must not be the two end characters

import random
from random import randint

print("Character Swapper")

random.seed()


def Swap(str):
    '''Swapping chars'''
    arr = list(str) #convert to list

    while(1):
        first = random.randint(0,len(str) - 1)
        second = random.randint(1, len(str) - 2)
        if(first != second):
            break

    temp = arr[first]
    arr[first] = arr[second]
    arr[second] = temp
    str = "".join(arr)
    print(str)

Swap("qwerty")
