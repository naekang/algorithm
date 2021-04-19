import sys

N, M = map(int, sys.stdin.readline().split())
num = list(map(int, sys.stdin.readline().split()))

sum = 0

for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if num[i] + num[j] + num[k] > M:
                continue
            else:
                sum = max(sum, num[i]+num[j]+num[k])

print(sum)
