// CodeUp/1087.cpp
// 작성자: 김석중. 작성일자: 2020.01.12.
// https://codeup.kr/problem.php?id=1087

#include <stdio.h>

int main() {
    int n, sum = 0, i = 1;
    scanf("%d", &n);

    do {
        sum += i++;
    } while (sum < n);

    printf("%d", sum);
    return 0;
}