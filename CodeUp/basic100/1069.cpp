// CodeUp/1069.cpp
// 작성자: 김석중. 작성일자: 2020.01.09.
// https://codeup.kr/problem.php?id=1069

#include <stdio.h>

int main() {
    char score;
    scanf("%c", &score);

    switch (score) {
        case 'A' : printf("best!!!"); break;
        case 'B' : printf("good!!"); break;
        case 'C' : printf("run!"); break;
        case 'D' : printf("slowly~"); break;
        default: printf("what?"); break;
    }

    return 0;
}