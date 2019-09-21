// Algorithm/1094.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/1094
// BOJ_1094_막대기

#include <stdio.h>
#define MAX 64
int n, cnt, len = MAX;
int main() {
    scanf("%d", &n);
    while(n > 0){
        if(len > n){
            len /= 2;
        } else {
            n -= len;
            cnt++;
        }
    }
    printf("%d",cnt);
    return 0;
}