class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        from collections import Counter

        count = Counter()

        for i in range(len(nums) - k + 1):
            window = set(nums[i:i + k])

            for num in window:
                count[num] += 1

        ans = -1

        for num, freq in count.items():
            if freq == 1:
                ans = max(ans, num)

        return ans