import sys

N = int(sys.stdin.readline())

# 무게 추들을 list형태로 입력받고 오름차순 정렬
w = sorted(list(map(int, sys.stdin.readline().split())))

sum = 1

# 정렬된 무게추 리스트를 돌며 처음부터 i까지의 무게 합과 추의 무게를 비교해보고
# 무게합이 작을 경우는 계속 값을 더하며 진행
# 무게합이 클 경우 멈추고 무게합에 1을 더해 반환
for i in range(N):
    if sum >= w[i]:
        sum += w[i]
    else:
        break

print(sum)
