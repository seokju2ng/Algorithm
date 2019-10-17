// Algorithm/2975.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/2975
// BOJ_2975_Transactions

#include <stdio.h>
int a, b;
char c;
int main() {
    while(1){
        scanf("%d", &a);
        scanf(" %c", &c);
        scanf("%d", &b);
        if(a == 0 && b == 0 && c == 'W') break;
        if(c == 'W'){
            if(a - b < -200) printf("Not allowed\n");
            else printf("%d\n", a - b);
        }
        else if(c == 'D'){
            printf("%d\n", a + b);
        }
    }
    return 0;
}