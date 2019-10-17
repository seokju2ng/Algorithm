// 작성자: 김석중. 1010.cpp.
// http://www.acmicpc.net/problem/1010
// BOJ_1010_다리 놓기

#include <stdio.h>
#define MAX 30
int ary[MAX][MAX];
int main() {
    int dataCnt, n, m;
    for(int i = 1; i < MAX; i++){
        ary[i][1] = i;
        for(int j = 2; j <= i; j++){
            ary[i][j] = ary[i-1][j-1] + ary[i-1][j];
        }
    }
    scanf("%d", &dataCnt);
    for(int i = 0; i < dataCnt; i++){
        scanf("%d %d", &n, &m);
        printf("%d\n", ary[m][n]);
    }
    return 0;
}