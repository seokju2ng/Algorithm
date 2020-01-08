// CodeUp/1066.cpp
// 작성자: 김석중. 작성일자: 2020.01.09.
// https://codeup.kr/problem.php?id=1066

#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d%d%d", &a, &b, &c);
    if (a % 2 == 0) printf("even\n");
    else printf("odd\n");
    if (b % 2 == 0) printf("even\n");
    else printf("odd\n");
    if (c % 2 == 0) printf("even\n");
    else printf("odd\n");
    return 0;
}