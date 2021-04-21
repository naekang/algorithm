import sys

N, M = map(int, sys.stdin.readline().split())
num = list(map(int, sys.stdin.readline().split()))

sum = 0

# 세개의 구간으로 나누기
# 3개의 수를 골라 더해가며 M을 넘지 않는 가장 큰 수 출력하기
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if num[i] + num[j] + num[k] > M:
                continue
            else:
                sum = max(sum, num[i]+num[j]+num[k])

print(sum)
