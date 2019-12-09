// CodeUp/1019.cpp
// 작성자: 김석중. 작성일자: 2019.12.10.
// https://codeup.kr/problem.php?id=1019

#include <stdio.h>

int main() {
    int y, m, d;
    scanf("%d.%d.%d", &y, &m, &d);
    printf("%04d.%02d.%02d", y, m, d);
    return 0;
}