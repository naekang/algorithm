import sys

# 최대 공약수를 구하는 함수
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


N, M = map(int, sys.stdin.readline().split())

# M에서 N과 M의 최대공약수 빼기
print(M - gcd(N, M))
