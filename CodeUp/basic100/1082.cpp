// CodeUp/1082.cpp
// 작성자: 김석중. 작성일자: 2020.01.11.
// https://codeup.kr/problem.php?id=1082

#include <stdio.h>

int main() {
    int x;
    scanf("%X", &x);

    for (int i = 1; i <= 0xF; ++i) {
        printf("%X*%X=%X\n", x, i, x*i);
    }
    return 0;
}