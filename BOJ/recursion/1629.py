# import sys

# A, B, C = map(int, sys.stdin.readline().split())

# # pow(A, B, C) = A의 B승을 C로 나눈 나머지
# print(pow(A, B, C))

import sys

A, B, C = map(int, sys.stdin.readline().split())

# 재귀의 방식을 사용하기 위해 함수로 작성
# B가 1일 경우는 그냥 나누기 진행
# 이외의 경우는 재귀의 방식을 이용하여 코드 작성
def solve(A, B):
    if B == 1:
        return A % C
    else:
        n = solve(A, B // 2)
        if B % 2 == 0:
            return n * n % C
        else:
            return n * A % C


print(solve(A, B))
