// CodeUp/1096.cpp
// 작성자: 김석중. 작성일자: 2020.01.15.
// https://codeup.kr/problem.php?id=1096

#include <stdio.h>
#define MAX 20

int main() {
    int pan[MAX][MAX] = {};
    int n, x, y;
    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d", &x, &y);
        pan[x][y] = 1;
    }
    for (int i = 1; i < MAX; ++i) {
        for (int j = 1; j < MAX; ++j) {
            printf("%d ", pan[i][j]);
        }
        printf("\n");
    }
    return 0;
}