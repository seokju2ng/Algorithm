// CodeUp/1068.cpp
// 작성자: 김석중. 작성일자: 2020.01.09.
// https://codeup.kr/problem.php?id=1068

#include <stdio.h>

int main() {
    int score;
    scanf("%d", &score);

    if (score >= 90)
        printf("A");
    else if (score >= 70)
        printf("B");
    else if (score >= 40)
        printf("C");
    else
        printf("D");

    return 0;
}