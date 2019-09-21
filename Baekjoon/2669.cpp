// Algorithm/2669.cpp
// 작성자: 김석중. 작성일자: 2019.04.15.
// http://www.acmicpc.net/problem/2669
// BOJ_2669_직사각형 네개의 합집합의 면적 구하기
/*
#include <stdio.h>
#define MAX 101
int area[MAX][MAX];
int x1, y1, x2, y2, sum;
int main() {
    for(int i = 0; i < 4; i++){
        scanf("%d %d %d %d", &x1, &y1, &x2, &y2);
        for(int j = x1; j < x2; j++){
            for(int k = y1; k < y2; k++){
                area[j][k] = 1;
            }
        }
    }
    for(int i = 0; i < MAX; i++){
        for(int j = 0; j < MAX; j++){
            sum += area[i][j];
        }
    }
    printf("%d", sum);
    return 0;
}
 */
#include <stdio.h>
int score[11];
int sum, x;
int main(){
    for(int i = 0; i < 10; i++){
        scanf("%d", &score[i]);
    }
    for(int i = 0; i < 10; i++){
        if(sum + score[i] <= 100) {
            sum += score[i];
            x = i;
        } else break;
    }
    if(100 - sum >= sum + score[x+1] - 100)
        printf("%d", sum + score[x+1]);
    else printf("%d", sum);
    return 0;
}