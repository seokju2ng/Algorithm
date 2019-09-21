// 작성자: 김석중. AddCycle_1110.cpp.

#include <stdio.h>
int add(int n);
int main(){
    int n, cnt = 0;
    scanf("%d", &n);
    int d = n;
    while(true){
        d = add(d);
        cnt++;
        if(d == n) break;
    }
    printf("%d", cnt);
    return 0;
}
int add(int n){
    int sum, sec = n % 10;
    n /= 10;
    sum = n + sec;
    sum = sum % 10 + sec * 10;
    return sum;
}