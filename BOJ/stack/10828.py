import sys


def push(n):
    stack.append(n)


def pop():
    if (not stack):
        return -1
    else:
        return stack.pop()


def size():
    return len(stack)


def empty():
    return 0 if stack else 1


def top():
    return stack[-1] if stack else -1


N = int(sys.stdin.readline().rstrip())
stack = []

for i in range(N):
    word = sys.stdin.readline().rstrip().split()

    f = word[0]

    if f == 'push':
        push(word[1])
    elif f == 'pop':
        print(pop())
    elif f == 'size':
        print(size())
    elif f == 'empty':
        print(empty())
    elif f == 'top':
        print(top())
