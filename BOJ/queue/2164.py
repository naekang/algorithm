import collections
import sys
N = int(sys.stdin.readline())
num = collections.deque([i for i in range(1, N+1)])

while len(num) > 1:  # 숫자가 하나 남을때까지 반복
    num.popleft()  # 왼쪽 숫자 제거
    num.rotate(-1)  # 왼쪽으로 로테이션

print(num[0])
