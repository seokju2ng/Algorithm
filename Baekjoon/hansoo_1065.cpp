// 작성자: 김석중. hansoo_1065.cpp.

#include <stdio.h>
int hansoo(int n);
int main(){
    int n;
    scanf("%d", &n);
    printf("%d\n",hansoo(n));
    return 0;
}
int hansoo(int n){
    int han, a[3], temp, c;
    if(n < 100) han = n;
    else han = 99;
    for(int i = 100; i <= n; i++){
        if(i == 1000) break;
        temp = i;
        c = 0;
        while(temp > 0){
            a[c] = temp % 10;
            temp /= 10;
            c++;
        }
        if(a[0] - a[1] == a[1] - a[2]) han++;
    }
    return han;
}