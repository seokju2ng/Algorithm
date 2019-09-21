// Algorithm/9663.cpp
// 작성자: 김석중. 작성일자: 2019.04.19.
// http://www.acmicpc.net/problem/9663
// BOJ_9663_N-Queen

#include <stdio.h>
#define MAX_CNT 15
typedef enum _check { FALSE, TRUE } check_t;

check_t columnChk[MAX_CNT + 1];
check_t incDiagonalLineChk[(MAX_CNT * 2) + 1];
check_t decDiagonalLineChk[(MAX_CNT * 2) + 1];
int placementCnt;
int N;
void nQueen(int row);

int main() {
    scanf("%d", &N);
    nQueen(1);
    printf("%d", placementCnt);
    return 0;
}

void nQueen(int row) {
    if(row > N) {
        placementCnt++;
        return;
    }
    for(int i = 0; i < N; i++){
        if(!columnChk[i] && !incDiagonalLineChk[row+i] && !decDiagonalLineChk[N+row-i]) {
            columnChk[i] = TRUE;
            incDiagonalLineChk[row + i] = TRUE;
            decDiagonalLineChk[N + row - i] = TRUE;
            nQueen(row + 1);
            columnChk[i] = FALSE;
            incDiagonalLineChk[row + i] = FALSE;
            decDiagonalLineChk[N + row - i] = FALSE;
        }
    }
}
