// CodeUp/1083.cpp
// 작성자: 김석중. 작성일자: 2020.01.12.
// https://codeup.kr/problem.php?id=1083

#include <stdio.h>

int main() {
    int a;
    scanf("%d", &a);

    for (int i = 1; i <= a; ++i) {
        if (i%3==0) printf("X ");
        else printf("%d ", i);
    }
    return 0;
}