import sys

N, K = map(int, sys.stdin.readline().split())

coin = []
cnt = 0

for i in range(N):
    coin.append(int(sys.stdin.readline()))

coin.sort(reverse=True)

for j in range(N):
    if K == 0:
        break
    cnt += K // coin[j]
    K %= coin[j]

print(cnt)
