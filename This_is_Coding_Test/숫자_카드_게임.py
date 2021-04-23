import sys
import time
start_time = time.time()

N, M = map(int, sys.stdin.readline().split())

# new_num = []
# for i in range(N):
#     num = list(map(int, sys.stdin.readline().split()))
#     new_num.append(min(num))

# print(max(new_num))

# 버전 1 - min() 함수 응용
# result = 0
# for i in range(N):
#     data = list(map(int, sys.stdin.readline().split()))
#     min_value = min(data)
#     result = max(result, min_value)

# print(result)


# 버전 2 - 2중 반복문 이용
result = 0
for i in range(N):
    data = list(map(int, sys.stdin.readline().split()))
    min_value = 10001
    for a in data:
        min_value = min(min_value, a)
    result = max(result, min_value)

print(result)

end_time = time.time()
print("time: ", end_time - start_time)
