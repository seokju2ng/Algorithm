// CodeUp/1045.cpp
// 작성자: 김석중. 작성일자: 2020.01.05.
// https://codeup.kr/problem.php?id=1045

#include <stdio.h>

int main() {
    long long int a, b;
    scanf("%lld%lld", &a, &b);
    printf("%lld\n", a + b);
    printf("%lld\n", a - b);
    printf("%lld\n", a * b);
    printf("%lld\n", a / b);
    printf("%lld\n", a % b);
    printf("%.2f\n", (float) a / b);
    return 0;
}