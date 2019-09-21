// Algorithm/8958.cpp
// 작성자: 김석중. 작성일자: 2019.04.15.
// http://www.acmicpc.net/problem/8958
// BOJ_8958_OX퀴즈

// 작성자: 김석중. Question8.cpp.

#include <stdio.h>
#include <string.h>
int checkPoint(char *dataArray, int dataCnt);
char ox[80];
int main(){
    int testCnt;
    scanf("%d", &testCnt);
    for(int i = 0; i < testCnt; i++){
        scanf("%s", ox);
        printf("%d\n", checkPoint(ox, strlen(ox)));
    }
    return 0;
}

int checkPoint(char *dataArray, int dataCnt){
    int score = 0, cnt = 0;
    for(int i = 0; i < dataCnt; i++){
        if(dataArray[i] == 'O') {
            score += cnt + 1; cnt++;
        }
        else cnt = 0;
    }
    return score;
}