// CodeUp/1081.cpp
// 작성자: 김석중. 작성일자: 2020.01.11.
// https://codeup.kr/problem.php?id=1081

#include <stdio.h>

int main() {
    int n, m;
    scanf("%d%d", &n, &m);

    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= m; ++j) {
            printf("%d %d\n", i, j);
        }
    }
    return 0;
}