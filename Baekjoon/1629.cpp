// Algorithm/1629.cpp
// 작성자: 김석중. 작성일자: 2019.04.21.
// http://www.acmicpc.net/problem/1629
// BOJ_1629_곱셈


#include <stdio.h>
long A, B, C, multi, res = 1;

int main() {
    scanf("%lu %lu %lu", &A, &B, &C);
    multi = A % C;
    while ( B > 0 ){
        if( B % 2 == 1 ){
            res *= multi;
            res %= C;
        }
        multi = (multi % C) * (multi % C) %C;
        B /= 2;
    }
    printf("%lu",res);
    return 0;
}