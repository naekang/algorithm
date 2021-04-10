import sys

N = int(sys.stdin.readline())

num = 0

# 100 보다 작은 경우는 다 등차수열 성립 -> count하는 개념으로 1씩 증가
for i in range(1, N+1):
    if i < 100:
        num += 1
    else:
        # 100이상일 경우 문자열로 변환후 쪼개서 리스트 형태로 저장
        # 1000 미만의 자연수를 대상으로 하기 때문에 첫째, 둘째, 셋째 자리의 값을 빼서 등차수열인지 확인
        num_list = list(map(int, str(i)))
        if (num_list[1] - num_list[0]) == (num_list[2] - num_list[1]):
            num += 1

print(num)
