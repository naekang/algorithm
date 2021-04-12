import sys

N = int(sys.stdin.readline())
num = sorted(list(map(int, sys.stdin.readline().split())))

# 짝수일 경우 가운데 값 중 작은 값을 출력
if (N % 2) == 0:
    print(num[N // 2 - 1])
# 홀수일 경우 가운데 값 출력
else:
    print(num[N // 2])
