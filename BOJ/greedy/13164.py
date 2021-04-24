import sys

N, K = map(int, sys.stdin.readline().split())

height = list(map(int, sys.stdin.readline().split()))

result = []

for i in range(1, N):
    result.append(height[i] - height[i-1])

result.sort()

sum = 0
for j in range(N-K):
    sum += result[j]

print(sum)
