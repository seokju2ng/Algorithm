// CodeUp/1095.cpp
// 작성자: 김석중. 작성일자: 2020.01.14.
// https://codeup.kr/problem.php?id=1095

#include <stdio.h>
#define MAX 23

int main() {
    int n, k, min = MAX;
    scanf("%d", &n);

    for (int i = 0; i < n; ++i) {
        scanf("%d", &k);
        if (min > k) min = k;
    }
    printf("%d", min);
    return 0;
}