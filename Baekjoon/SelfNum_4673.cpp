// 작성자: 김석중. SelfNum_4673.cpp.

#include <stdio.h>
#define MAX 10001
int ary[MAX];
int d(int n);

int main(){
    for(int i = 1; i < MAX; i++){
        ary[d(i)] = 1;
    }
    for(int i = 1; i < MAX; i++){
        if(ary[i] == 0)
            printf("%d\n", i);
    }
    return 0;
}

int d(int n){
    int res = n;
    while(n > 0){
        res += n % 10;
        n /= 10;
    }
    return res;
}