// 작성자: 김석중. stack_10828.cpp.

#include <stdio.h>
int stack[10000];
int top = 0;
int main(){
    int n, data;
    char command[6];
    scanf("%d", &n);
    getchar();
    while(n > 0){
        scanf("%s", command);
        switch (command[0]){
            case 'p' :
                if(command[1] == 'u'){
                    scanf("%d", &data);
                    stack[top++] = data;
                }
                else{
                    if(top == 0) printf("-1\n");
                    else printf("%d\n", stack[--top]);
                }
                break;
            case 's' : printf("%d\n", top); break;
            case 'e' : if(top == 0) printf("1\n"); else printf("0\n"); break;
            case 't' : if(top == 0) printf("-1\n"); else printf("%d\n", stack[top-1]); break;
        }
        n--;
    }
    return 0;
}
