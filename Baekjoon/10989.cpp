// Algorithm/10989.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/10989
// BOJ_10989_수 정렬하기 3

#include <stdio.h>
int n, temp, max;
int num[10001];
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &temp);
        num[temp]++;
        if(max < temp) max = temp;
    }
    for(int i = 0; i < 10001; i++){
        if(num[i] == 0) continue;
        if(i > max) break;
        for(int j = 0; j < num[i]; j++){
            printf("%d\n", i);
        }
    }
    return 0;
}