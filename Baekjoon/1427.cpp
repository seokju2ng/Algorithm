// Algorithm/1427.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/1427
// BOJ_1427_소트인사이드

#include <stdio.h>
int n, len, max, temp;
int sort[10];
int main() {
    scanf("%d", &n);
    for(len = 0; n > 0; len++){
        sort[len] = n % 10;
        n /= 10;
    }
    for(int i = 0; i < len - 1; i++){
        max = i;
        for(int j = i + 1; j < len; j++){
            if(sort[max] < sort[j]) max = j;
        }
        temp = sort[max];
        sort[max] = sort[i];
        sort[i] = temp;
    }
    for(int j = 0; j < len; j++){
        printf("%d", sort[j]);
    }
    return 0;
}