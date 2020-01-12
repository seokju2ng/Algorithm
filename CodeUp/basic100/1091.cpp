// CodeUp/1091.cpp
// 작성자: 김석중. 작성일자: 2020.01.13.
// https://codeup.kr/problem.php?id=1091

#include <stdio.h>

int main() {
    long long int a, m, d, n;
    scanf("%lld%lld%lld%lld", &a, &m, &d, &n);
    for (int i = 1; i < n; ++i) {
        a = a * m + d;
    }
    printf("%lld", a);
    return 0;
}