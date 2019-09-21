// Algorithm/2442.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/2442
// BOJ_2442_별 찍기 - 5

#include <stdio.h>
int n;
int main() {
    scanf("%d", &n);
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n - i; j++){
            printf(" ");
        }
        for(int j = 1; j <= i*2-1; j++){
            printf("*");
        }
        printf("\n");
    }
    return 0;
}