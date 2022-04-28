# -*- coding: UTF-8 -*-
'''
@Project ：algorithm-study 
@File ：ㅇ.py
@IDE  ：PyCharm 
@Author ： Hwang
@Date ：2022-04-24 오후 5:48 
'''

import sys
from collections import deque

dx = [-1,-1,-1,0,0,1,1,1]
dy = [-1,0,1,-1,1,-1,0,1]

def bfs(x,y, graph):
    graph[x][y] = -1
    q = deque([[x,y]])

    while q:
        _x, _y = q.popleft()

        for i in range(8):
            nx = _x + dx[i]
            ny = _y + dy[i]
            if 0<= nx < h and 0<= ny < w and graph[nx][ny] == 1:
                graph[nx][ny] = -1
                q.append([nx,ny])

    return graph

while True:
    w, h = map(int, sys.stdin.readline().split())

    if w == 0 and h == 0:
        exit()

    graph = []
    for i in range(h):
        graph.append(list(map(int, sys.stdin.readline().split())))

    cnt = 0

    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1:
                cnt+=1
                graph = bfs(i,j,graph)

    print(cnt)
