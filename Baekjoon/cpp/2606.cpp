// Algorithm/2606.cpp
// 작성자: 김석중. 작성일자: 2019.04.19.
// http://www.acmicpc.net/problem/2606
// BOJ_2606_바이러스

#include<stdio.h>

int d[101][101] = { 0 };
int n, m, a, b, chk;

int main()
{
    scanf("%d", &n);
    scanf("%d", &m);
    for(int i = 0; i < m; i++){
        scanf("%d %d", &a, &b);
        d[a][b] = d[b][a] = 1;
    }
    for(int k = 1; k <= n; ++k){
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= n; ++j){
                if(d[i][k] == 1 && d[k][j] == 1) d[i][j] = 1;
            }
        }
    }
    for(int i = 2; i <= n; i++){
        if(d[1][i] == 1) chk++;
    }
    printf("%d", chk);
    return 0;
}
