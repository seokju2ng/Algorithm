// CodeUp/1080.cpp
// 작성자: 김석중. 작성일자: 2020.01.11.
// https://codeup.kr/problem.php?id=1080

#include <stdio.h>

int main() {
    int a, i, sum = 0;
    scanf("%d", &a);

    for (i = 1; a > sum; ++i) {
        sum += i;
    }

    printf("%d", i-1);

    return 0;
}