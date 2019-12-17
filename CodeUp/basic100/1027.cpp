// CodeUp/1027.cpp
// 작성자: 김석중. 작성일자: 2019.12.18.
// https://codeup.kr/problem.php?id=1027

#include <stdio.h>

int main() {
    int y, m, d;
    scanf("%d.%d.%d", &y, &m, &d);
    printf("%02d-%02d-%04d", d, m, y);
    return 0;
}