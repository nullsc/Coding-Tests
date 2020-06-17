class Solution:
    def duplicateZeros(self, arr: List[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        aLen = len(arr)
        newArr = []
        for i in arr:
            #print(i)
            if i == 0:
                newArr.append(0)
                newArr.append(0)
            else:
                newArr.append(i)
                
        del newArr[aLen:] #truncate list
        #print(newArr)
        #arr = newArr
        print(arr)
        for t in range(0, aLen):
            arr[t] = newArr[t]
            
