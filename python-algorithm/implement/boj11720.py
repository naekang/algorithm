import sys

N = int(sys.stdin.readline())
num = sys.stdin.readline().rstrip()

ans = 0

for i in num:
    ans += int(i)

print(ans)

