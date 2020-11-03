
print("Python Algorithms")

arr = [1,2,3,4,5,6, 25]
salaries = [10000, 20000, 30000, 40000, 50000]

list1 = [1,2,3,4,5]
list2 = [1,2,3,4,5]

def sumAll(A):
    #return sum of all numbers
    sum = 0
    for a in range(len(A)):
        #print(A[a])
        sum += A[a]
    return sum

def countEven(A):
    #return sum of all even number
    sum = 0
    for i in range(len(A)):
        if A[i] % 2 == 0:
            #print(A[i])
            sum += A[i]
    return sum

def countSalaries(A):
    #count salaries & avg over 30K
    count = 0 
    sum = 0
    i = 0
    for i in range(0, len(A)):
        if (A[i] >= 30000):
            #print("count:", count)
            count += 1
            sum += A[i]
    #print(count, sum)
    return sum/count

def existsEven(A):
    for i in range(0, len(A)):
        if (A[i] % 2 == 0):
            print("even")
            return True

    return False

def find20(A):
    count = 0
    for i in range(0, len(A)):
        if (A[i] >= 20):
            #print("index: ", i)
            return i
    return -1

def equalList(A, B):
    #check if 2 lists are the same
    if (len(A) != len(B)):
        return -1

    for i in range(0, len(A)):
        if(A[i] != B[i]):
            return False
    return True

sal = [1000, 20000, 15000, 40000]
genders = ['M', 'F', 'M', 'F']

def salarySplit(salaries, genders):
    male = []
    female = []
    for i in range(0, len(genders)):
        if (genders[i] == 'M'):
            male.append(salaries[i])
        else:
            female.append(salaries[i])

    return (male, female)

print(sumAll(arr))
print(countEven(arr))
print(countSalaries(salaries))
print(existsEven(arr))
print(find20(arr))
print(equalList(list1, list2))
print(salarySplit(sal, genders))

