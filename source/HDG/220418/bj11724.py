# -*- coding: UTF-8 -*-
'''
@Project ：algorithm-study 
@File ：bj11724.py
@IDE  ：PyCharm 
@Author ： Hwang
@Date ：2022-04-18 오후 6:48 
'''

import sys

def find(parent, x):
    if parent[x] == x:
        return x
    return find(parent, parent[x])

def union(parent, x, y):
    x = find(parent, x)
    y = find(parent, y)
    if x < y:
        parent[y] =x
    else:
        parent[x] =y

vertex, edge = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(vertex+1)]
parent = [ i for i in range(vertex+1)]

for _ in range(edge):
    a, b = map(int, sys.stdin.readline().split())
    union(parent, a, b)

result = []
for i in parent[1:]:
    result.append(find(parent,i))

print(len(set(result)))