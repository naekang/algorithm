import sys

L, R = map(str, sys.stdin.readline().split())

cnt = 0

# 자리수가 다를 경우는 무조건 8이 없는 경우가 있기 때문에 0 출력
if len(L) != len(R):
    print(0)
# 자리수가 같더라도 경우를 나눌 수 있음
else:
    if L[0] != R[0]:
        print(0)
    else:
        if L[0] == '8':
            cnt += 1
        for i in range(1, len(L)):
            if L[i] != R[i]:
                break
            else:
                if L[i] == '8':
                    cnt += 1
        print(cnt)
