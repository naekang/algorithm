import sys

S, K = map(int, sys.stdin.readline().split())

# 몫
q = S // K
# 나머지
r = S % K
n = 1

# 주어진 S를 K로 나누고 각각의 몫에 1씩 배분
# 1을 가장 많이 배분할 수록 가장 큰 수가 나옴
# K값을 1씩 줄여가며 0이 되기 전까지 곱셈 계산
while K != 0:
    # 나머지의 수만큼 몫에 1을 더해 총 값을 계산
    if r > 0:
        n *= (q + 1)
        r -= 1
    # 나머지가 0인 경우 몫 값만 그대로 계산
    else:
        n *= q
    K -= 1

print(n)
