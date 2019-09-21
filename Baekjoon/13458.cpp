// 작성자: 김석중. 13458.cpp.
// http://www.acmicpc.net/problem/13458
// BOJ_13458_시험 감독

#include <stdio.h>
#include <stdlib.h>
int main() {
    int n, b, c;
    long long cnt = 0;
    scanf("%d", &n);
    int *a = (int *)malloc(sizeof(int) * n);
    for(int i = 0; i < n; i++){
        scanf("%d", a + i);
    }
    scanf("%d", &b); scanf("%d", &c);
    cnt += n;
    for(int i = 0; i < n; i++){
        a[i] -= b;
        if(a[i] > 0){
            if(a[i] % c) cnt += a[i] / c + 1;
            else cnt += a[i] / c;
        }
    }
    printf("%lld", cnt);
    return 0;
}