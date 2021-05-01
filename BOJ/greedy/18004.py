import sys

a, b = map(int, sys.stdin.readline().split())

cnt = 0

# a와 b의 입력 값이 같으면 연산과정이 필요없으므로 0출력
if a == b:
    print("0")
# a보다 b가 더 클 경우 계속 1씩 더하여 값을 맞춰야하기 때문에 b-a번
elif a < b:
    print(b-a)
# a가 b보다 클 경우 -> while문을 사용하여 조건을 걸어준다.
# 짝수일 경우는 2로 나누기
# 홀수일 경우는 1을 더하여 짝수 만들기
# 사이클을 돌때마다 카운트 값 1씩 증가
# a가 float형으로 바뀌므로 출력값에 int 지정
else:
    while a > b:
        if a % 2 == 0:
            a /= 2
        else:
            a += 1
        cnt += 1
    print(int(cnt+b-a))
