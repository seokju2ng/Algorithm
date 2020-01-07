// CodeUp/1064.cpp
// 작성자: 김석중. 작성일자: 2020.01.08.
// https://codeup.kr/problem.php?id=1063

#include <stdio.h>

int main() {
    int a, b, c;
    scanf("%d%d%d", &a, &b, &c);
    printf("%d", a < b ? a < c ? a : c : b < c ? b : c);
    return 0;
}