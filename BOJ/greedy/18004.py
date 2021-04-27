import sys

a, b = map(int, sys.stdin.readline().split())

cnt = 0

if a == b:
    print("0")
elif a < b:
    print(b-a)
else:
    while a > b:
        if a % 2 == 0:
            a /= 2
        else:
            a += 1
        cnt += 1
    print(int(cnt+b-a))
