// Algorithm/7600.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/7600
// BOJ_7600_문자가 몇갤까

#include <stdio.h>
#include <string.h>
int alpha[26];
char c;
int chk;
int main() {
    while(1){
        while(1) {
            scanf("%c", &c);
            if(c == '\n' || c == '#') break;
            if(c >= 'A' && c <= 'Z') alpha[c-'A']++;
            else if(c >= 'a' && c <= 'z') alpha[c-'a']++;
        }
        if(c == '#') break;
        for(int i = 0; i < 26; i++){
            if(alpha[i] != 0){
                alpha[i] = 0;
                chk++;
            }
        }
        printf("%d\n", chk);
        chk = 0;
    }
    return 0;
}