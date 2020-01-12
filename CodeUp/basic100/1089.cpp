// CodeUp/1089.cpp
// 작성자: 김석중. 작성일자: 2020.01.13.
// https://codeup.kr/problem.php?id=1089

#include <stdio.h>

int main() {
    int a, d, n;
    scanf("%d%d%d", &a, &d, &n);
    printf("%d", a + d * (n-1));
    return 0;
}