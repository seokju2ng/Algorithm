// CodeUp/1079.cpp
// 작성자: 김석중. 작성일자: 2020.01.11.
// https://codeup.kr/problem.php?id=1079

#include <stdio.h>

int main() {
    char c;

    do {
        scanf("%c ", &c);
        printf("%c\n", c);
    } while (c != 'q');

    return 0;
}