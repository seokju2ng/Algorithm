// Algorithm/2667.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/2667
// BOJ_2667_단지번호 붙이기


#include<stdio.h>
#define MAX_SIZE 25
char map[MAX_SIZE][MAX_SIZE];
void dfs(int row, int col, int tNum);
int n;
int tunnelNumber;
int size[MAX_SIZE * MAX_SIZE / 2 + 3];
int main()
{
    scanf("%d", &n);
    for(int i = 0; i < n; ++i){
        scanf("%s", map[i]);
    }
    tunnelNumber = 2;
    for(int i = 0; i < n; ++i){
        for(int j = 0; j < n; ++j){
            if(map[i][j] == '1') dfs(i, j, tunnelNumber++);
        }
    }
    printf("%d\n", tunnelNumber-2);
    int minIndex, temp;
    for(int i = 2; i < tunnelNumber; ++i){
        minIndex = i;
        for(int j = i + 1; j < tunnelNumber; ++j){
            if(size[minIndex] > size[j]) minIndex = j;
        }
        temp = size[minIndex];
        size[minIndex] = size[i];
        size[i] = temp;
    }
    for (int i = 2; i < tunnelNumber; ++i) {
        printf("%d\n", size[i]);
    }
    return 0;
}
void dfs(int row, int col, int tNum)
{
    map[row][col] = (char)(tNum + '0');
    ++size[tNum];
    if(row+1 < n && map[row+1][col] == '1') dfs(row+1, col, tNum);
    if(row-1 >= 0 && map[row-1][col] == '1') dfs(row-1, col, tNum);
    if(col-1 >= 0 && map[row][col-1] == '1') dfs(row, col-1, tNum);
    if(col+1 < n && map[row][col+1] == '1') dfs(row, col+1, tNum);
}