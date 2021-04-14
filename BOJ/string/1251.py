word = list(input())
ans = []
tmp = []

# 범위 설정하여 문자열 나누기
for i in range(1, len(word)-1):
    for j in range(i+1, len(word)):
        a = word[:i][::-1]
        b = word[i:j][::-1]
        c = word[j:][::-1]
        tmp.append(a + b + c)

# 앞서 저장된 tmp list에서 띄어쓰기를 없애고 단어 붙이기
for k in tmp:
    ans.append(''.join(k))

# 가장 첫번째 단어 출력
print(sorted(ans)[0])
