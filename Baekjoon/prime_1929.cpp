// https://www.acmicpc.net/problem/1929
// BOJ_1929_소수 구하기

#include <stdio.h>
#include <math.h>
int main() {
    int m, n, i, j, chk;
    scanf("%d %d", &m, &n);
    if(n == 1) return 0;
    if(m <= 2) { printf("2\n"); m = 2; }
    for(i = m; i <= n; i++) {
        if(i % 2 == 0) continue;
        chk = 0;
        for(j = 2; j <= sqrt(i); j++){
            if(i % j == 0){
                chk = 1;
                break;
            }
        }
        if(chk == 0) printf("%d\n", i);
    }
    return 0;
}
