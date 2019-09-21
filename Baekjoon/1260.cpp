// Algorithm/1260.cpp
// 작성자: 김석중. 작성일자: 2019.04.21.
// http://www.acmicpc.net/problem/1260
// BOJ_1260_DFS와 BFS

#include <stdio.h>
#define MAX 1000
int n, m, v, a, b, front, rear;
int graph[MAX+1][MAX+1];
int visited[MAX+1];
int queue[MAX];
void DFS(int);
void BFS();
void initVisit();

int main() {
    scanf("%d %d %d", &n, &m, &v);
    for(int i = 0; i < m; i++){
        scanf("%d %d", &a, &b);
        graph[a][b] = graph[b][a] = 1;
    }
    DFS(v);
    initVisit();
    BFS();
    return 0;
}
void DFS(int a){
    visited[a] = 1;
    printf("%d ", a);
    for(int i = 1; i <= n; i++){
        if(graph[a][i] && !visited[i]) {
            DFS(i);
        }
    }
}
void BFS(){
    int temp;
    visited[v] = 1;
    queue[rear++] = v;
    while(front != rear){
        temp = queue[front++];
        printf("%d ", temp);
        for(int i = 1; i <= n; i++){
            if(graph[temp][i] && !visited[i]){
                queue[rear++] = i;
                visited[i] = 1;
            }
        }
    }
}
void initVisit(){
    for(int i = 1; i <= n; i++)
        visited[i] = 0;
    printf("\n");
}