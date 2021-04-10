from itertools import combinations

# N과 S를 입력 받음
N, S = map(int, input().split())

# N개의 수를 입력받아 list의 형태로 저장
arr = list(map(int, input().split()))
# count 값 0으로 초기화
count = 0

# 1부터 N까지의 숫자 사이의 모든 조합의 경우의 수 계산
for i in range(1, N+1):
    num = list(combinations(arr, i))

    # 모든 조합들의 합을 구하며 S와 같아지는 경우가 있는지 확인하여 있다면 count 1증가
    for j in range(len(num)):
        sum_num = sum(num[j])
        if sum_num == S:
            count += 1

# count 값 출력
print(count)
