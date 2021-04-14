import sys

N = int(sys.stdin.readline())

# list 형식으로 입력받고 오름차순 정렬
A = sorted(list(map(int, sys.stdin.readline().split())))
B = sorted(list(map(int, sys.stdin.readline().split())))

sum = 0

# 정렬된 list들의 각 인자들을 교차로 곱하여 최소값을 구할 수 있음
for i in range(N):
    sum += A[i] * B[N - i - 1]

print(sum)
