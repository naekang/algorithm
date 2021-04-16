import sys

K = int(sys.stdin.readline())

A = []

for i in range(K):
    num = int(sys.stdin.readline())
    # 0이 나오면 가장 최신 값 꺼내기
    if num == 0:
        A.pop()
    # 0이 아닐경우는 그냥 넣기
    else:
        A.append(num)

print(sum(A))
