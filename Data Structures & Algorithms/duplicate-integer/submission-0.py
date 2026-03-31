class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
       n = len(nums)
       my_set = set(nums)
       m = len(my_set)

       if(n == m):
        return False
       else: 
        return True
