// CodeUp/1094.cpp
// 작성자: 김석중. 작성일자: 2020.01.14.
// https://codeup.kr/problem.php?id=1094

#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, *ary;
    scanf("%d", &n);
    ary = (int *) malloc(n * sizeof(int));
    for (int i = 0; i < n; ++i) {
        scanf("%d", &ary[i]);
    }
    for (int j = n - 1; j >= 0; --j) {
        printf("%d ", ary[j]);
    }
    free(ary);
    return 0;
}