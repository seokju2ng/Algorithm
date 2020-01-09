// CodeUp/1076.cpp
// 작성자: 김석중. 작성일자: 2020.01.10.
// https://codeup.kr/problem.php?id=1076

#include <stdio.h>

int main() {
    char a, t = 'a';
    scanf("%c", &a);
    do {
        printf("%c ", t++);
    } while (a >= t);
    return 0;
}