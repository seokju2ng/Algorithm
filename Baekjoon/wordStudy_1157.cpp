// 작성자: 김석중. wordStudy_1157.cpp.

#include <stdio.h>
int alpha[26];
int main(){
    char str[1000000];
    int i = 0, max = 0, cnt = 0;
    scanf("%s", str);
    while(true){
        if(str[i] == '\0') break;
        if(str[i] >= 65 && str[i] <= 90)
            alpha[str[i]-65]++;
        else if(str[i] >= 97 && str[i] <= 122)
            alpha[str[i]-97]++;
        i++;
    }
    for(int a = 0; a < 26; a++){
        if(max < alpha[a]){
            max = alpha[a];
            i = a;
        }
    }
    for(int a = 0; a < 26; a++){
        if(max == alpha[a]) cnt++;
    }
    if(cnt == 1) printf("%c", i + 65);
    else printf("?");

    return 0;
}