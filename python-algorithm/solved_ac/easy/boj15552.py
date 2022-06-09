import sys

T = int(sys.stdin.readline())

while T != 0:
    A, B = map(int, sys.stdin.readline().split())
    print(A + B)
    T -= 1
