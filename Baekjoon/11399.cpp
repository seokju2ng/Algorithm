// Algorithm/11399.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/11399
// BOJ_11399_ATM

#include <stdio.h>
int n, p[1000], min, temp;
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &p[i]);
    }
    for(int i = 0; i < n - 1; i++){
        min = i;
        for(int j = i + 1; j < n; j++){
            if(p[min] > p[j]) min = j;
        }
        temp = p[min];
        p[min] = p[i];
        p[i] = temp;
    }
    temp = 0;
    for(int i = 0; i < n; i++){
        for(int j = 0; j <= i; j++){
            temp += p[j];
        }
    }
    printf("%d", temp);
    return 0;
}