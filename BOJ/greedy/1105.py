import sys

L, R = map(str, sys.stdin.readline().split())

cnt = 0

# 자리수가 다를 경우는 무조건 8이 없는 경우가 있기 때문에 0 출력
if len(L) != len(R):
    print(0)
# 자리수가 같더라도 경우를 나눌 수 있음
else:
    # 앞자리 수가 다를 경우 0 출력
    if L[0] != R[0]:
        print(0)
    else:
        # 앞자리수가 8일 경우 카운트 값 1 증가
        if L[0] == '8':
            cnt += 1
        # 앞자리수 다음 부터 반복문을 돌며 8이 나올경우 카운트 값 1증가
        for i in range(1, len(L)):
            if L[i] != R[i]:
                break
            else:
                if L[i] == '8':
                    cnt += 1
        print(cnt)
