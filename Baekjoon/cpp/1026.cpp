// Algorithm/1026.cpp
// 작성자: 김석중. 작성일자: 2019.04.14.
// http://www.acmicpc.net/problem/1026
// BOJ_1026_보물

#include <stdio.h>
int n, A[50], B[50], choice, temp;
int main() {
    scanf("%d", &n);
    for(int j = 0; j < n; j++){
        scanf("%d", &A[j]);
    }
    for(int j = 0; j < n; j++){
        scanf("%d", &B[j]);
    }
    for(int i = 0; i < n - 1; i++){
        choice = i;
        for(int j = i+1; j < n; j++){
            if(A[choice] > A[j]) choice = j;
        }
        temp = A[choice];
        A[choice] = A[i];
        A[i] = temp;
    }
    for(int i = 0; i < n - 1; i++){
        choice = i;
        for(int j = i+1; j < n; j++){
            if(B[choice] < B[j]) choice = j;
        }
        temp = B[choice];
        B[choice] = B[i];
        B[i] = temp;
    }
    temp = 0;
    for(int i = 0; i < n; i++){
        temp += A[i] * B[i];
    }
    printf("%d", temp);
    return 0;
}