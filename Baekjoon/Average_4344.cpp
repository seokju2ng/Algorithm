// 작성자: 김석중. Average_4344.cpp.

#include <stdio.h>
int main(){
    int testCnt, stdntCnt, sum, chk;
    int score[1000];
    double avg;
    scanf("%d", &testCnt);
    while(testCnt--){
        chk = 0;
        sum = 0;
        scanf("%d", &stdntCnt);
        for(int i = 0; i < stdntCnt; i++) {
            scanf("%d", &score[i]);
            sum += score[i];
        }
        avg = (double)sum / stdntCnt;
        for(int i = 0; i < stdntCnt; i++)
            if(avg < score[i]) chk++;
        printf("%.3lf%%\n", (double)chk/stdntCnt*100);
    }
    return 0;
}