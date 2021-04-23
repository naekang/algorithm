# import sys

# N = int(sys.stdin.readline())

# a = N // 500
# N = N % 500
# b = N // 100
# N = N % 100
# c = N // 50
# N = N % 50
# d = N // 10

# print(a + b + c + d)

import sys

N = int(sys.stdin.readline())
count = 0

# 큰 단위의 화폐부터 차레대로 확인
coin_types = [500, 100, 50, 10]

for coin in coin_types:
    count += N // coin  # 해당 화폐로 거슬러 줄 수 있는 동전의 개수 세기
    N %= coin

print(count)
