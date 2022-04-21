# -*- coding: UTF-8 -*-
'''
@Project ：algorithm-study 
@File ：bj1012.py
@IDE  ：PyCharm 
@Author ： Hwang
@Date ：2022-04-16 오후 11:32 
'''

import sys
sys.setrecursionlimit(10**6)

def dfs(x,y, graph):
    dx = [1,-1,0,0]
    dy = [0,0,-1,1]

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
            graph[nx][ny] = 2
            graph = dfs(nx,ny,graph)

    return  graph


for _ in range(int(sys.stdin.readline())):
    m, n, cabbage = map(int, sys.stdin.readline().split())
    graph = [[0] * m for __ in range(n)]
    count = 0

    for i in range(cabbage):
        x, y = map(int, sys.stdin.readline().split())
        graph[y][x] = 1

    for x in range(n):
        for y in range(m):
            if graph[x][y] == 1:
                graph[x][y] = 2
                count+=1
                graph = dfs(x,y,graph)

    print(count)