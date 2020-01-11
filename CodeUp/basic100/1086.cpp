// CodeUp/1086.cpp
// 작성자: 김석중. 작성일자: 2020.01.12.
// https://codeup.kr/problem.php?id=1086

#include <stdio.h>

int main() {
    long long int w, h, b;
    scanf("%lld%lld%lld", &w, &h, &b);
    printf("%.2lf MB", w*h*b/8/1024/1024.0);
    return 0;
}