// CodeUp/1085.cpp
// 작성자: 김석중. 작성일자: 2020.01.12.
// https://codeup.kr/problem.php?id=1085

#include <stdio.h>

int main() {
    long long int h, b, c, s;
    scanf("%lld%lld%lld%lld", &h, &b, &c, &s);
    printf("%.1lf MB", h*b/8*c*s/1024/1024.0);
    return 0;
}