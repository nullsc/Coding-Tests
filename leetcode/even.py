#  Find Numbers with Even Number of Digits
#  'Your runtime beats 98.34 % of python3 submissions.' ;)

class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        total = 0
        for i in range(0, len(nums)):
            ilen = len(str(nums[i]))

            if (ilen % 2 == 0):
                print(nums[i])
                total += 1
                
        print(f"total: {total}")
        return total
