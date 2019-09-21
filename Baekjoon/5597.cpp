// Algorithm/5597.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/5597
// BOJ_5597_과제 안 내신 분...?

#include <stdio.h>
int temp;
int st[31];
int main() {
    for(int i = 0; i < 28; i++){
        scanf("%d", &temp);
        st[temp]++;
    }
    for(int i = 1; i < 31; i++){
        if(st[i] == 0)
            printf("%d\n", i);
    }
    return 0;
}