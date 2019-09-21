// https://www.acmicpc.net/problem/4948
// BOJ_4948_베르트랑 공준

#include <stdio.h>
#include <math.h>
int main() {
    int n = 1, chk, prime;
    while(true){
        scanf("%d", &n);
        if(n == 0) return 0;
        prime = 0;
        for(int i = n + 1; i <= n*2; i++) {
            chk = 0;
            if(i == 2) prime++;
            if(i % 2 == 0) continue;
            for(int j = 2; j <= sqrt(i); j++){
                if(i % j == 0){
                    chk++;
                    break;
                }
            }
            if(chk == 0) prime++;
            //printf("i = %d, prime = %d\n", i , prime);
        }
        printf("%d\n", prime);
    }
}
