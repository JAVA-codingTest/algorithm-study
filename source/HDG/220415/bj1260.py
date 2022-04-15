import sys
from collections import deque

n, m, v = map(int,sys.stdin.readline().split())
graph = [[] for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a].append(b)
    graph[b].append(a)

def dfs(node):
    stack = [node]
    visited = [node]

    while stack:
        target = stack.pop()
        for i in sorted(graph[target]):
            if i not in visited:
                stack.append(target)
                stack.append(i)
                visited.append(i)
                break

    print(' '.join(map(str, visited)))
    return


def bfs(node):
    queue = deque()
    queue.append(node)
    visited = [node]

    while queue:
        target = queue.popleft()
        for i in sorted(graph[target]):
            if i not in visited:
                queue.append(i)
                visited.append(i)

    print(' '.join(map(str, visited)))
    return

dfs(v)
bfs(v)