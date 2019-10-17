// 작성자: 김석중. tomato_7576.cpp.

#include <iostream>
#include <queue>
#define MAX 1000
using namespace std;
queue<pair<int, int>> q;
pair<int, int> p;
int i, j, m, n;
int d[4][2] = {{1,0}, {-1,0}, {0,-1}, {0, 1}};
int dx, dy;
int minDay;
int box[MAX][MAX];
int visited[MAX][MAX];


int main(){
    scanf("%d %d", &n, &m);
    for(i = 0; i < m; i++){
        for(j = 0; j < n; j++){
            scanf(" %d", &box[i][j]);
            if(box[i][j] == 1){
                q.push(make_pair(i, j));
                visited[i][j] = 1;
            }
        }
    }
    while(!q.empty()){
        p = q.front();
        q.pop();
        for(i = 0; i < 4; i++){
            dx = p.first + d[i][0];
            dy = p.second + d[i][1];
            if(dx >= 0 && dx < m && dy >= 0 && dy < n){
                if(box[dx][dy] == 0){
                    q.push(make_pair(dx, dy));
                    visited[dx][dy] = visited[p.first][p.second] + 1;
                    box[dx][dy] = 1;
                }
            }
        }
    }
    for(i = 0; i < m; i++){
        for(j = 0; j < n; j++){
            minDay = minDay > visited[i][j] ? minDay : visited[i][j];
            if(box[i][j] == 0) { printf("-1"); return 0; }
        }
    }
    printf("%d\n", minDay-1);
    return 0;
}