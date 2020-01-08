// CodeUp/1065.cpp
// 작성자: 김석중. 작성일자: 2020.01.09.
// https://codeup.kr/problem.php?id=1065

#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d%d%d", &a, &b, &c);
    if (a % 2 == 0) printf("%d\n", a);
    if (b % 2 == 0) printf("%d\n", b);
    if (c % 2 == 0) printf("%d\n", c);
    return 0;
}