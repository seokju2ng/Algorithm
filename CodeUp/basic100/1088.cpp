// CodeUp/1088.cpp
// 작성자: 김석중. 작성일자: 2020.01.13.
// https://codeup.kr/problem.php?id=1088

#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for (int i = 1; i <= n; ++i) {
        if (i % 3 == 0) continue;
        printf("%d ", i);
    }
    return 0;
}