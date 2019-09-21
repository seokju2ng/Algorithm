// Algorithm/2490.cpp
// 작성자: 김석중. 작성일자: 2019.04.15.
// http://www.acmicpc.net/problem/2490
// BOJ_2490_윷놀이

#include <stdio.h>
int t, yoot;
int main() {

    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
            scanf("%d", &t);
            if(t == 0) yoot++;
        }
        if(yoot == 0) printf("E\n");
        else printf("%c\n", yoot+'A' - 1);
        yoot = 0;
    }
    return 0;
}