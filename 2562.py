import sys

nums = []

for i in range(9):
    num = int(sys.stdin.readline())
    nums.append(num)

print(max(nums))
print(nums.index(max(nums))+1)
