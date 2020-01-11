// CodeUp/1084.cpp
// 작성자: 김석중. 작성일자: 2020.01.12.
// https://codeup.kr/problem.php?id=1084

#include <stdio.h>

int main() {
    int c = 0;
    int r, g, b;
    scanf("%d%d%d", &r, &g, &b);

    for (int i = 0; i < r; i++)
        for (int j = 0; j < g; j++)
            for (int k = 0; k < b; k++) {
                printf("%d %d %d\n", i, j, k);
                c++;
            }

    printf("%d ", c);
    return 0;
}