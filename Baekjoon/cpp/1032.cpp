// Algorithm/1032.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/1032
// BOJ_1032_명령 프롬프트

#include <stdio.h>
int n, chk;
char str[50][51];
char c;
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", str[i]);
    }
    for(int i = 0; i < 50; i++){
        chk = 0;
        c = str[0][i];
        if(c == '\0') break;
       for(int j = 1; j < n; j++){
           if(c != str[j][i]) chk++;
       }
       if(chk == 0) printf("%c", c);
       else printf("?");
    }
    return 0;
}