// CodeUp/1099.cpp
// 작성자: 김석중. 작성일자: 2020.01.15.
// https://codeup.kr/problem.php?id=1099

#include <stdio.h>

#define MAX 10

int main() {
    int miro[MAX + 1][MAX + 1] = {};
    int temp;

    for (int i = 1; i <= MAX; ++i) {
        for (int j = 1; j <= MAX; ++j) {
            scanf("%d", &miro[i][j]);
        }
    }

    for (int i = 2, j = 2; i <= MAX && j <= MAX;) {
        temp = miro[i][j];
        miro[i][j] = 9;
        if (temp == 2) break;
        if (miro[i][j + 1] == 1) {
            if (miro[i + 1][j] == 1) {
                break;
            } else i++;
        } else j++;
    }

    for (int i = 1; i <= MAX; ++i) {
        for (int j = 1; j <= MAX; ++j) {
            printf("%d ", miro[i][j]);
        }
        printf("\n");
    }
    return 0;
}