// 작성자: 김석중. 16728.cpp.
// http://www.acmicpc.net/problem/16728
// BOJ_16728_Chaarshanbegaan at Cafebazaar
/*
#include <stdio.h>
#include <math.h>

int main() {
    int dataCnt, x, y, score, total = 0;
    double d;
    scanf("%d", &dataCnt);
    for(int i = 0; i < dataCnt; i++){
        scanf("%d %d", &x, &y);
        d = sqrt(x * x + y * y);
        score = 10;
        for(int j = 10; score > 0; j += 20){
            if(d <= j) break;
            score--;
        }
        total += score;
    }
    printf("%d\n", total);
    return 0;
}
 */
#include <stdio.h>

unsigned long combination(int n, int k) {
    int i;
    unsigned long value = 1;
    for (i = n; i > n - k; i--)
        value *= i;
    for (i = k; i > 0; i--)
        value /= i;
    return value;
}
int main() {
    int testCnt, N, M;
    scanf("%d", &testCnt);
    for(int i = 0; i < testCnt; i++){
        scanf("%d %d", &N, &M);
        printf("%lu", combination(M, N));
    }
    return 0;
}