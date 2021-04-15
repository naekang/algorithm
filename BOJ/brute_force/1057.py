import sys

N, k, l = map(int, sys.stdin.readline().split())

cnt = 0

while k != l:
    k -= k // 2
    l -= l // 2
    cnt += 1

print(cnt)
