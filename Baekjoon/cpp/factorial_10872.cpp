// 작성자: 김석중. factorial_10872.cpp.

#include <stdio.h>
int factorial[13];
int main(){
    int n;
    scanf("%d", &n);
    factorial[0] = factorial[1] = 1;
    for(int i = 2; i <= n; i++){
        factorial[i] = factorial[i-1] * i;
    }
    printf("%d", factorial[n]);
    return 0;
}

