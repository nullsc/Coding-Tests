# test.py
# return distinct elements of an array

#test = [2, 1, 1, 2, 3, 1]
test = [1,2,3,4,5, 5,4,2]

def solution(arr: list) -> list:
    if not arr:
        return False
    
    temp = []
    
    for i in arr:
        print(i)
        if i not in temp:
            temp.append(i)
            
    return temp
        
        
print(solution(test))
