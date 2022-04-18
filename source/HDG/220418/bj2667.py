# -*- coding: UTF-8 -*-
'''
@Project ：algorithm-study 
@File ：bj2667.py
@IDE  ：PyCharm 
@Author ： Hwang
@Date ：2022-04-18 오후 9:22 
'''

import sys
from collections import deque

n = int(sys.stdin.readline())
graph = []
total = 0
amount = []
dx = [0,0,-1,1]
dy = [1,-1,0,0]

for _ in range(n):
    graph.append(list(map(int,sys.stdin.readline().split()[0])))

def bfs(x,y):
    count = 1
    q = deque([[x,y]])
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<n and 0<=ny<n and graph[nx][ny] == 1:
                graph[nx][ny] = 2
                q.append([nx,ny])
                count+=1
    amount.append(count)


for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            graph[i][j] = 2
            total+=1
            bfs(i,j)

print(total)
for i in sorted(amount):
    print(i)