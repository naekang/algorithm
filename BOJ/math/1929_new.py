import sys
import math


def isPrime(m, n):
    arr = [True] * (m-n)

    max_div = int(math.sqrt(n))

    for i in range(2, max_div+1):
        if arr[i] == True:
            for j in range(i+i, n, i):
                arr[i] = False

    for i in range(m, n+1):
        if arr[i] == True:
            return print(arr[i])


M, N = map(int, sys.stdin.readline().split())

isPrime(M, N)
