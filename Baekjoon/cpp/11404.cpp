// Algorithm/11404.cpp
// 작성자: 김석중. 작성일자: 2019.04.19.
// http://www.acmicpc.net/problem/11404
// BOJ_11404_플로이드

#include <stdio.h>
#define MAX 100
#define INF 10000000


int vertex, edge;
int d[MAX + 1][MAX + 1];
void floydWarshall();
void printGraph();
void initGraph();

int main() {
    scanf("%d", &vertex);
    scanf("%d", &edge);
    initGraph();
    floydWarshall();
    printGraph();
    return 0;
}
void initGraph() {
    int i, j, w;
    for(i = 1; i <= vertex; i++){
        for(j = 1; j <= vertex; j++){
            if(i == j)
                d[i][j] = 0;
            else d[i][j] = INF;
        }
    }
    for(int k = 0; k < edge; k++){
        scanf(" %d %d %d", &i, &j, &w);
        if(d[i][j] == 0) d[i][j] = w;
        else if(d[i][j] > w) d[i][j] = w;
    }
}


void floydWarshall() {
    for(int k = 1; k <= vertex; k++){
        for(int i = 1; i <= vertex; i++){
            if(k == i)
                continue;
            for(int j = 1; j <= vertex; j++){
                if(k == j || i == j)
                    continue;
                if(d[i][j] > d[i][k] + d[k][j])
                    d[i][j] = d[i][k] + d[k][j];
            }
        }
    }
}

void printGraph() {
    int i, j;

    for (i = 1 ; i <= vertex ; i++) {
        for (j = 1 ; j <= vertex ; j++) {
            if (d[i][j] == INF)
                printf("0 ");
            else
                printf("%d ", d[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}