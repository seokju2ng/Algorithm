// BoostCamp 2020 2차 테스트 / 2번 문제
// 작성자: 김석중. 작성일자: 2020.07.11.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NUM (11)
#define INF (-1)
enum {A, B, C, D, E, F, G, H, I, J, K};
int graph[NUM][NUM] = {0,};
int save[NUM] = {-1,};
int cnt = 0;

void initGraph();
void dfs(int dist, int cur, int dest);
void printGraph();
int *solution(const char *origin, const char *dest);

int main() {
//    int *result = solution("A", "D");
//    int *result = solution("B", "G");
//    int *result = solution("F", "D");
    int *result = solution("F", "F");
    if (result == NULL) {
        return -1;
    }
    printf("[");
    for (int i = 0; i < cnt; ++i) {
        printf("%d,", result[i]);
    }
    printf("\b]\n");

    free(result);

    return 0;
}

int *solution(const char *origin, const char *dest) {
    initGraph();
//    printGraph();
    dfs(0, origin[0] - 'A', dest[0] - 'A');
    if (cnt == 0) cnt++;
    int *answer = (int *)malloc(cnt * sizeof(int));
    if (answer == NULL) return NULL;
    memcpy(answer, save, cnt * sizeof(int));
    return answer;
}

void dfs(int dist, int cur, int dest) {
    if (cur == dest) {
        save[cnt++] = dist;
        return;
    }
    for (int i = 0; i < NUM; ++i) {
        if (graph[cur][i] > 0) {
            dfs(dist + graph[cur][i], i, dest);
        }
    }
    
}

void printGraph() {
    for (int i = 0; i < NUM; ++i) {
        for (int j = 0; j < NUM; ++j) {
            if (graph[i][j] == INF) {
                printf(" INF");
                continue;
            }
            printf("%4d", graph[i][j]);
        }
        printf("\n");
    }
}

void initGraph() {
    for (int i = 0; i < NUM; ++i) {
        for (int j = 0; j < NUM; ++j) {
            if (i != j) graph[i][j] = INF;
        }
    }
    graph[A][B] = 1;    graph[A][C] = 2;    graph[A][F] = 4;
    graph[B][D] = 2;    graph[B][E] = 1;    graph[C][D] = 2;
    graph[D][G] = 1;    graph[D][K] = 2;    graph[E][H] = 1;
    graph[F][G] = 3;    graph[G][H] = 1;    graph[G][I] = 2;
    graph[G][J] = 3;    graph[H][J] = 1;    graph[H][K] = 2;
    graph[I][J] = 2;
}
