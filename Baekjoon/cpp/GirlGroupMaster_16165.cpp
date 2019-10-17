// 작성자: 김석중. GirlGroupMaster_16165.cpp.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100
typedef struct _GirlGroup{
    char groupName[MAX];
    int memberNum;
    char memberName[MAX][MAX];
}GirlGroup;

int main(){
    GirlGroup *gg;
    char ques[MAX], temp[MAX];
    int testCnt, qNum, q, index;
    scanf("%d %d", &testCnt, &qNum);
    gg = (GirlGroup *)malloc(sizeof(GirlGroup) * testCnt);
    for(int i = 0; i < testCnt; i++){
        scanf("%s", gg[i].groupName);
        scanf("%d", &gg[i].memberNum);
        for(int j = 0; j < gg[i].memberNum; j++){
            scanf("%s", gg[i].memberName[j]);
        }
    }
    for(int i = 0; i < testCnt; i++){
        for(int j = 0; j < gg[i].memberNum; j++){
            index = j;
            for(int k = j + 1; k < gg[i].memberNum; k++){
                if(strcmp(gg[i].memberName[index], gg[i].memberName[k]) > 0) index = k;
            }
            strcpy(temp, gg[i].memberName[j]);
            strcpy(gg[i].memberName[j], gg[i].memberName[index]);
            strcpy(gg[i].memberName[index], temp);
        }
    }
    for(int i = 0; i < qNum; i++){
        scanf("%s", ques);
        scanf("%d", &q);
        if(q == 1) {
            for (int j = 0; j < testCnt; j++) {
                for (int k = 0; k < gg[j].memberNum; k++) {
                    if (strcmp(gg[j].memberName[k], ques) == 0) {
                        printf("%s\n", gg[j].groupName);
                    }
                }
            }
        }
        if(q == 0) {
            for( int j = 0; j < testCnt; j++){
                if(strcmp(gg[j].groupName, ques) == 0){
                    for(int k = 0; k < gg[j].memberNum; k++){
                        printf("%s\n", gg[j].memberName[k]);
                    }
                }
            }
        }

    }
    return 0;
}