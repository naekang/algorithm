import sys


def GCD(X, Y):
    while(Y):
        X, Y = Y, X % Y
    return X


def LCM(X, Y):
    result = (X*Y) // GCD(X, Y)
    return result


T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(LCM(A, B))
