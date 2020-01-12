// CodeUp/1090.cpp
// 작성자: 김석중. 작성일자: 2020.01.13.
// https://codeup.kr/problem.php?id=1090

#include <stdio.h>
#include <math.h>

int main() {
    int a, r, n;
    scanf("%d%d%d", &a, &r, &n);
    printf("%.0f", a * pow(r, n-1));
    return 0;
}
