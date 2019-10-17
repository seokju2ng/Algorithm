// Algorithm/5622.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/5622
// BOJ_5622_다이얼

#include <stdio.h>
char word[16];
int time;
int main() {
    scanf("%s", word);
    for(int i = 0; word[i] != '\0'; i++){
        if(word[i] < 'D') time += 3;
        else if(word[i] < 'G') time += 4;
        else if(word[i] < 'J') time += 5;
        else if(word[i] < 'M') time += 6;
        else if(word[i] < 'P') time += 7;
        else if(word[i] < 'T') time += 8;
        else if(word[i] < 'W') time += 9;
        else if(word[i] <= 'Z') time += 10;
    }
    printf("%d", time);
    return 0;
}