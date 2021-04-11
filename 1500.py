import sys

S, K = map(int, sys.stdin.readline().split())

# 몫
q = S // K
# 나머지
r = S % K
n = 1

# 주어진 S를 K로 나누고 각각의 몫에 1씩 배분
# 1을 가장 많이 배분할 수록 가장 큰 수가 나옴
while K != 0:
    if r > 0:
        n *= (q + 1)
        r -= 1
    else:
        n *= q
    K -= 1

print(n)
