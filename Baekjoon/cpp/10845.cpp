// Algorithm/10845.cpp
// 작성자: 김석중. 작성일자: 2019.04.12.
// http://www.acmicpc.net/problem/10845
// BOJ_10845_큐

#include <stdio.h>
int queue[10000];
int main(){
    int n, data;
    int front = -1, rear = -1;
    char command[6];
    scanf("%d", &n);
    getchar();
    while(n > 0){
        scanf("%s", command);
        switch (command[0]){
            case 'p' :
                if(command[1] == 'u'){
                    scanf("%d", &data);
                    queue[++rear] = data;
                }
                else{
                    if(front == rear) printf("-1\n");
                    else printf("%d\n", queue[++front]);
                }
                break;
            case 's' : printf("%d\n", rear-front); break;
            case 'e' : if(front == rear) printf("1\n"); else printf("0\n"); break;
            case 'f' : if(front == rear) printf("-1\n"); else printf("%d\n", queue[front+1]); break;
            case 'b' : if(front == rear) printf("-1\n"); else printf("%d\n", queue[rear]); break;
        }
        n--;
    }
    return 0;
}
