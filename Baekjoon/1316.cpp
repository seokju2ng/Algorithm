// Algorithm/1316.cpp
// 작성자: 김석중. 작성일자: 2019.04.15.
// http://www.acmicpc.net/problem/1316
// BOJ_1316_그룹 단어 체커

#include <stdio.h>
#include <string.h>
char alpha[26];
char str[101];
int n, cnt, chk;
int main() {
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", str);
        for(int j = 0; j < strlen(str); j++){
            if(alpha[str[j]-'a'] == 0){
                alpha[str[j]-'a'] = 1;
                continue;
            }
            else if(alpha[str[j]-'a'] == 1 && str[j] == str[j-1]) continue;
            else { cnt++; break;}
        }
        if(cnt == 0) chk++;
        cnt = 0;
        for(int i = 0; i < 26; i++){
            alpha[i] = 0;
        }
    }
    printf("%d", chk);
    return 0;
}