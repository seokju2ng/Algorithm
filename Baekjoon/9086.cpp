// Algorithm/9086.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/9086
// BOJ_9086_문자열

#include <stdio.h>
#include <string.h>
int n;
char str[1000];
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", str);
        printf("%c%c\n", str[0], str[strlen(str) - 1]);
    }
    return 0;
}