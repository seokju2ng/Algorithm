// CodeUp/1070.cpp
// 작성자: 김석중. 작성일자: 2020.01.09.
// https://codeup.kr/problem.php?id=1070

#include <stdio.h>

int main() {
    int month;
    scanf("%d", &month);

    switch (month) {
        case 3:
        case 4:
        case 5: printf("spring"); break;
        case 6:
        case 7:
        case 8: printf("summer"); break;
        case 9:
        case 10:
        case 11: printf("fall"); break;
        case 12:
        case 1:
        case 2: printf("winter"); break;
        default: break;
    }

    return 0;
}