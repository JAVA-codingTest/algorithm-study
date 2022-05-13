# -*- coding: UTF-8 -*-
'''
@Project ：algorithm-study 
@File ：code.py
@IDE  ：PyCharm 
@Author ： Hwang
@Date ：2022-05-14 오전 1:04 
'''

import sys

n, s = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))

answer = float('inf')
left, right = 0,0
temp = 0

while True:
    print(left, right, temp)
    if temp >= s:
        answer = min(answer, right - left)
        temp -= arr[left]
        left+=1
    elif right == n:
        break
    else:
        temp += arr[right]
        right+=1

print(answer if answer != float('inf') else 0)
