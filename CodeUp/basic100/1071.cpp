// CodeUp/1071.cpp
// 작성자: 김석중. 작성일자: 2020.01.10.
// https://codeup.kr/problem.php?id=1071

#include <stdio.h>

int main() {
    int a;
    input:
    scanf("%d", &a);
    if (a == 0)
        goto finish;
    printf("%d\n", a);
    goto input;
    finish:
    return 0;
}