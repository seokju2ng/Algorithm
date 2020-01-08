// CodeUp/1067.cpp
// 작성자: 김석중. 작성일자: 2020.01.09.
// https://codeup.kr/problem.php?id=1067

#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);
    if (a > 0) {
        printf("plus\n");
    } else {
        printf("minus\n");
    }
    if (a % 2 == 0) {
        printf("even\n");
    } else {
        printf("odd\n");
    }
    return 0;
}