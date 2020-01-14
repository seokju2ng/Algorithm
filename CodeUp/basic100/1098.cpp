// CodeUp/1098.cpp
// 작성자: 김석중. 작성일자: 2020.01.15.
// https://codeup.kr/problem.php?id=1098

#include <stdio.h>
#include <stdlib.h>

int main() {
    int **pan;
    int w, h, n, l, d, x, y;

    scanf("%d%d", &h, &w);
    pan = (int **) calloc(h + 1, sizeof(int *));
    for (int i = 0; i <= h; ++i) {
        pan[i] = (int *) calloc(w+1, sizeof(int));
    }

    scanf("%d", &n);
    for (int i = 0; i < n; ++i) {
        scanf("%d%d%d%d", &l, &d, &x, &y);
        if (d == 0) {
            for (int j = 0; j < l; ++j, ++y) {
                pan[x][y] = 1;
            }
        } else {
            for (int j = 0; j < l; ++j, ++x) {
                pan[x][y] = 1;
            }
        }
    }

    for (int i = 1; i <= h; ++i) {
        for (int j = 1; j <= w; ++j) {
            printf("%d ", pan[i][j]);
        }
        printf("\n");
    }

    for (int i = 0; i < h; ++i) {
        free(pan[i]);
    }
    free(pan);
    return 0;
}