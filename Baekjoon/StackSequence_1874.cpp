// 작성자: 김석중. StackSequence.cpp.

#include <stdio.h>

int main(){
    int stack[100000]; char oper[200000];
    int top = 0, o_top = 0, n, c, max = 0;
    scanf("%d", &n);
    while(n--){
        scanf("%d", &c);
        if(c > max){
            for(int i = max + 1; i <= c; i++){
                stack[top++] = i;
                oper[o_top++] = '+';
            }
        }
        else if(stack[top - 1] != c){
            puts("NO"); return 0;
        }
        top--;
        oper[o_top++] = '-';
        if(max < c) max = c;
    }
    for(int i = 0; i < o_top; i++){
        printf("%c\n", oper[i]);
    }
    return 0;
}