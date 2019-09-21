// Algorithm/10093.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/10093
// BOJ_10093_숫자

#include <stdio.h>

int main() {
    unsigned long long a, b, temp;
    scanf("%llu %llu", &a, &b);
    if( a == b ) {printf("0"); return 0;}
    if( a > b ){
        temp = a;
        a = b;
        b = temp;
    }
    printf("%llu\n", b-a-1);
    for(unsigned long long i = a+1; i < b; i++){
        printf("%llu ", i);
    }
    return 0;
}