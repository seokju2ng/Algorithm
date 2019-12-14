// CodeUp/1024.cpp
// 작성자: 김석중. 작성일자: 2019.12.15.
// https://codeup.kr/problem.php?id=1024

#include <stdio.h>

int main() {
    char str[21];
    scanf("%s", str);
    for (int i = 0; str[i] != '\0'; ++i) {
        printf("\'%c\'\n", str[i]);
    }
    return 0;
}