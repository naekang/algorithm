import sys
import time
start_time = time.time()

N, K = map(int, sys.stdin.readline().split())

# cnt = 0

# while N >= K:
#     if N % K == 0:
#         N //= K
#         cnt += 1
#     else:
#         N -= 1
#         cnt += 1

# while N > 1:
#     N -= 1
#     cnt += 1

# print(cnt)
result = 0

while True:
    target = (N // K) * K
    result += (N - target)
    N = target
    if N < K:
        break
    result += 1
    N //= K

result += (N - 1)
print(result)

end_time = time.time()
print("time: ", end_time - start_time)
