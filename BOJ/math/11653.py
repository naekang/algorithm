import sys

N = int(sys.stdin.readline())

i = 2

while N != 1:
    # i로 나누어 지는 결과 판단하기
    if N % i == 0:
        N /= i
        print(i)
    # 나누어 떨어지지 않는 경우 1씩 증가시키며 인수 찾기
    else:
        i += 1
