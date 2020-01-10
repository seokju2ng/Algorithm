// CodeUp/1078.cpp
// 작성자: 김석중. 작성일자: 2020.01.11.
// https://codeup.kr/problem.php?id=1078

#include <stdio.h>

int main() {
    int a, sum = 0;
    scanf("%d", &a);

    for (int i = 1; i <= a; ++i) {
        if (i % 2 == 0) sum += i;
    }
    printf("%d", sum);
    return 0;
}