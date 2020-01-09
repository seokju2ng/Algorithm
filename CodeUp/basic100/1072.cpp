// CodeUp/1072.cpp
// 작성자: 김석중. 작성일자: 2020.01.10.
// https://codeup.kr/problem.php?id=1072

#include <stdio.h>

int main() {
    int n, a;
    scanf("%d", &n);
    input:
    scanf("%d", &a);
    printf("%d\n", a);
    --n;
    if (n > 0) {
        goto input;
    }
    return 0;
}