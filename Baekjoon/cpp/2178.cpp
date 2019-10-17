// Algorithm/2178.cpp
// 작성자: 김석중. 작성일자: 2019.04.21.
// http://www.acmicpc.net/problem/2178
// BOJ_2178_미로 탐색

#include <stdio.h>
#define MAX 101

typedef struct _rc{
   int row;
   int col;
}RC;
RC start, goal;
RC queue[MAX*MAX];
int map[MAX][MAX];
int n, m, front, rear;
int d[4][2] = {{1,0}, {-1,0}, {0,-1}, {0, 1}};
void print();
int BFS();
bool inRange(int r, int c);

int main() {
    scanf("%d %d", &n, &m);
    start.row = 1; start.col = 1;
    goal.row = n; goal.col = m;
    for(int i = 1; i <= n; i++){
        getchar();
        for(int j = 1; j <= m; j++){
            scanf("%c", &map[i][j]);
            map[i][j] -= 49;
        }
    }
    map[1][1] = 1;
    printf("%d", BFS());
    //print();
    return 0;
}

void print(){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= m; j++){
            printf("%2d", map[i][j]);
        }
        printf("\n");
    }
}

int BFS(){
    RC p;
    int dist = 0;
    queue[rear++] = start;
    while(rear != front){
        p = queue[front++];
        if(p.row == goal.row && p.col == goal.col) break;
        for(int i = 0; i < 4; i++){
            int dx = p.row + d[i][0];
            int dy = p.col + d[i][1];
            if(inRange(dx, dy)){
                if(map[dx][dy] == 0){
                    queue[rear].row = dx;
                    queue[rear++].col = dy;
                    map[dx][dy] = map[p.row][p.col] + 1;
                    if(dx == goal.row && dy == goal.col)
                        dist = map[dx][dy];
                }
            }
        }
    }
    return dist;
}
bool inRange(int r, int c)
{
    if(0 < r && r <= n && 0 < c && c <= m)
        return true;
    else
        return false;
}