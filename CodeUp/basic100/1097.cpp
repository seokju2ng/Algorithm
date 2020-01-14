// CodeUp/1097.cpp
// 작성자: 김석중. 작성일자: 2020.01.15.
// https://codeup.kr/problem.php?id=1097

#include <stdio.h>
#define MAX 20

int main() {
    int pan[MAX][MAX] = {};
    int n, x, y;
    for (int i = 1; i < MAX; ++i) {
        for (int j = 1; j < MAX; ++j) {
            scanf("%d", &pan[i][j]);
        }
    }


    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d", &x,&y);
        for (int j = 1; j < MAX; ++j) {
            if (pan[x][j] == 1)
                pan[x][j] = 0;
            else
                pan[x][j] = 1;
            if (pan[j][y] == 1)
                pan[j][y] = 0;
            else
                pan[j][y] = 1;
        }
    }



    for (int i = 1; i < MAX; ++i) {
        for (int j = 1; j < MAX; ++j) {
            printf("%d ", pan[i][j]);
        }
        printf("\n");
    }
    return 0;
}