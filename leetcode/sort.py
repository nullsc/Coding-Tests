class Solution:
    def sortedSquares(self, A: List[int]) -> List[int]:
        nArr = []
        for i in A:
            #print(i**2)
            t = i**2
            nArr.append(t)
            
        nArr.sort()
        #print(nArr)
        return nArr
        
#class Solution:
#    def sortedSquares(self, A: List[int]) -> List[int]:
#        ans = []
#        for i in A:
#            ans.append(i*i)
#        return sorted(ans)
