#Make a function that will take a string and randomly switch two characters in the string,
#it must not be the two end characters
try:
    import random
    from random import randint
except ImportError:
    print("Error importing library")


print("Character Swapper")

random.seed() #make sure it's less predictable


def swap(str):
    #print(str)
    arr = list(str) #convert to list as strings are immutable

    while(1): #make sure they aren't the same
        first = random.randint(0, len(str) - 1)
        second = random.randint(1, len(str) - 2)
        if(first != second):
            break

    temp = arr[first]
    arr[first] = arr[second]
    arr[second] = temp
    str = "".join(arr) #back to string
    #print(str)
    return str

print(swap("qwerty"))
