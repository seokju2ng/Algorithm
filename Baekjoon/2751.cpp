// Algorithm/2751.cpp
// 작성자: 김석중. 작성일자: 2019.04.15.
// http://www.acmicpc.net/problem/2751
// BOJ_2751_수 정렬하기 2

#include <stdio.h>
#include <stdlib.h>
int compare(const void *a, const void *b) {
    int num1 = *(int *)a;
    int num2 = *(int *)b;
    if (num1 < num2) return -1;
    if (num1 > num2) return 1;
    return 0;
}
int n, num[1000000], min, temp;
int main(){
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &num[i]);
    }
    qsort(num, n, sizeof(int), compare);
    for(int i = 0; i < n; i++){
        printf("%d\n", num[i]);
    }
    return 0;
}