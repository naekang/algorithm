import sys

T = int(sys.stdin.readline())

for _ in range(T):
    x, y = map(int, sys.stdin.readline().split())
    dist = y - x
    cnt = 0
    move = 1
    dist_sum = 0
    while dist_sum < dist:
        cnt += 1
        dist_sum += move
        if cnt % 2 == 0:
            move += 1
    print(cnt)
