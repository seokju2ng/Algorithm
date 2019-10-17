// 작성자: 김석중. changeBall_10813.cpp.
// http://www.acmicpc.net/problem/10813
// BOJ__10813_공 바꾸기

#include <stdio.h>

int main() {
    int busket[101];
    int n, m, a, b, temp;
    scanf("%d %d", &n, &m);
    for(int i = 1; i <= n; i++){
        busket[i] = i;
    }
    for(int i = 0; i < m; i++){
        scanf("%d %d", &a, &b);
        temp = busket[a];
        busket[a] = busket[b];
        busket[b] = temp;
    }
    for(int i = 1; i <= n; i++){
        printf("%d ", busket[i]);
    }
    return 0;
}