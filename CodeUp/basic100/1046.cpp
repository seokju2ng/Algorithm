// CodeUp/1046.cpp
// 작성자: 김석중. 작성일자: 2020.01.05.
// https://codeup.kr/problem.php?id=1046

#include <stdio.h>

int main() {
    long long int a, b, c, sum;
    float avg;

    scanf("%lld%lld%lld", &a, &b, &c);
    sum = a + b + c;
    avg = (float) sum / 3;
    printf("%lld\n", sum);
    printf("%.1f\n", avg);
    return 0;
}