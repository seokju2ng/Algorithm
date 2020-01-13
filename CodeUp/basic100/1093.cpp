// CodeUp/1093.cpp
// 작성자: 김석중. 작성일자: 2020.01.14.
// https://codeup.kr/problem.php?id=1093

#include <stdio.h>
#define STUDENT_NUM 23

int main() {
    int st[STUDENT_NUM] = {};
    int n, a;
    scanf("%d", &n);

    for (int i = 0; i < n; ++i) {
        scanf("%d", &a);
        st[a-1]++;
    }

    for (int j = 0; j < STUDENT_NUM; ++j) {
        printf("%d ", st[j]);
    }
    return 0;
}