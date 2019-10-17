// Algorithm/15552.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/15552
// BOJ_15552_빠른 A+B
/*
#include <stdio.h>
int n, a, b;
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d %d", &a, &b);
        printf("%d\n", a+b);
    }
    return 0;
}
*//*
#include <stdio.h>
int n, tp;
unsigned long long sum;
int main() {
    scanf("%d", &n);
    for(int i= 0; i < n * n; i++){
        scanf("%d", &tp);
        sum += tp;
    }
    printf("%llu", sum);
    return 0;
}*/