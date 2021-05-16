import sys

n = int(sys.stdin.readline())

num = []
s = 2

for i in range(n):
    num.append(list(map(int, sys.stdin.readline().split())))

# 가장 왼쪽, 오른쪽, 중간으로 범위를 나눠서 계산한다
# 가장자리에 있는 경우는 더할 숫자가 정해져 있어 인덱스 계산만 잘해서 더하면 됨
# 중간에 있는 숫자의 경우 오른쪽 위, 왼쪽 위의 값 중 최대값을 구하여 더함
for j in range(1, n):
    for k in range(s):
        if k == 0:
            num[j][k] = num[j][k] + num[j-1][k]
        elif j == k:
            num[j][k] = num[j][k] + num[j-1][k-1]
        else:
            num[j][k] = num[j][k] + max(num[j-1][k-1], num[j-1][k])
    s += 1

print(max(num[n-1]))
