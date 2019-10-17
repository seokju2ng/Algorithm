// 작성자: 김석중. TimeToDecompress_17010.cpp.

#include <stdio.h>

int main(){
    int n, d;
    char c;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &d);
        scanf(" %c", &c);
        for(int j = 0; j < d; j++) putchar(c);
        printf("\n");
    }
    return 0;
}