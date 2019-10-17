// 작성자: 김석중. SmallerThanX_10871.cpp.

#include <stdio.h>

int main(){
    int seq[10000];
    int n, x;
    scanf("%d %d", &n, &x);
    for(int i = 0; i < n; i++)
        scanf("%d", &seq[i]);
    for(int i = 0; i < n; i++)
        if(seq[i] < x)
            printf("%d ", seq[i]);
}