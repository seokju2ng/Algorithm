// Algorithm/17009.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/17009
// BOJ_17009_Winning Score

#include <stdio.h>
int temp;
int ascore , bscore;
int main() {
    for(int i = 3; i > 0; i--) {
        scanf("%d", &temp);
        ascore += temp * i;
    }
    for(int i = 3; i > 0; i--) {
        scanf("%d", &temp);
        bscore += temp * i;
    }
    if(ascore > bscore) printf("A");
    else if(ascore < bscore) printf("B");
    else printf("T");
    return 0;
}