// Algorithm/4892.cpp
// 작성자: 김석중. 작성일자: 2019.04.21.
// http://www.acmicpc.net/problem/4892
// BOJ_4892_숫자 맞추기 게임

#include <stdio.h>
int n, t;
int main() {
    while(1){
        scanf("%d", &n);
        if(n == 0) break;
        printf("%d. ", ++t);
        if(n % 2 == 0) printf("even ");
        else printf("odd ");
        printf("%d\n", n/2);
    }
    return 0;
}