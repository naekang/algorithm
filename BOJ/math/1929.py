import sys
import math


def isPrime(n):
    if n == 1:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True


M, N = map(int, sys.stdin.readline().split())

for i in range(M, N+1):
    if isPrime(i) == True:
        print(i)
