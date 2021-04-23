# import sys

# N, M, K = map(int, sys.stdin.readline().split())

# num = sorted(list(map(int, sys.stdin.readline().split())))

# num.reverse()

# sum = 0

# while True:
#     for i in range(K):
#         if M == 0:
#             break
#         else:
#             sum += num[0]
#             M -= 1
#     if M == 0:
#         break
#     else:
#         sum += num[1]
#         M -= 1

# print(sum)

import sys

N, M, K = map(int, sys.stdin.readline().split())

data = list(map(int, sys.stdin.readline().split()))

data.sort()  # 입력받은 수 정렬
first = data[N-1]  # 가장 큰 수
second = data[N-2]  # 두번째로 큰 수

# 가장 큰 수가 더해지는 횟수 계산
count = int(M / (K + 1)) * K
count += M % (K + 1)

result = 0
result += (count) * first  # 가장 큰 수 더하기
result += (M-count) * second  # 두번째로 큰 수 더하기

print(result)
