// Algorithm/11403.cpp
// 작성자: 김석중. 작성일자: 2019.04.19.
// http://www.acmicpc.net/problem/11403
// BOJ_11403_경로찾기

#include<stdio.h>

int d[101][101];  // 그래프 연결 정보 저장(인접 행렬법)
int n; // 정점의 개수

int main()
{
    scanf("%d", &n);
    for(int i = 1; i <= n; i++)
        for(int j = 1; j <= n; j++)
            scanf("%d", &d[i][j]);
    for(int k = 1; k <= n; ++k){
        for(int i = 1; i <= n; ++i){
            for(int j = 1; j <= n; ++j){
                if(d[i][k] == 1 && d[k][j] == 1) d[i][j] = 1;
            }
        }
    }
    for(int i=1; i<=n; i++) {
        for(int j=1; j<=n; j++) {
            printf("%d ", d[i][j]);
        }
        printf("\n");
    }
    return 0;
}
