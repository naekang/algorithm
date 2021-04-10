import sys

N = int(sys.stdin.readline())
K = int(sys.stdin.readline())

sensors = sorted(list(map(int, sys.stdin.readline().split())))

# 집중국의 수가 더 많을 경우 센서와 동일하게 설치하면 되기 때문에 0 출력
if K >= N:
    print(0)
    sys.exit()

dis = []
# 거리를 계산하고 오름차순 정렬
for i in range(1, N):
    dis.append(sensors[i]-sensors[i-1])

dis.sort(reverse=True)

# 가장 큰 수를 K-1개 제거
for _ in range(K-1):
    dis.pop(0)

print(sum(dis))
