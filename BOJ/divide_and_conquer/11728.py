import sys

N, M = map(int, sys.stdin.readline().split())

# 2개의 리스트 입력받기
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))

# 오름차순 정렬
new_list = sorted(a + b)

# 리스트형식을 str형으로 바꾸고 띄어쓰기를 포함하여 출력
print(" ".join(map(str, new_list)))
