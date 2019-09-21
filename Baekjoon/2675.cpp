// Algorithm/2675.cpp
// 작성자: 김석중. 작성일자: 2019.04.15.
// http://www.acmicpc.net/problem/2675
// BOJ_2675_문자열 반복

#include <stdio.h>
#include <string.h>
int n, num;
char str[21];
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &num);
        scanf("%s", str);
        for(int j = 0; j < strlen(str); j++){
            for(int k = 0; k < num; k++){
                printf("%c", str[j]);
            }
        }
        printf("\n");
    }
    return 0;
}