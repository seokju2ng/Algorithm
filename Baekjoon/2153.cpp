// Algorithm/2153.cpp
// 작성자: 김석중. 작성일자: 2019.04.13.
// http://www.acmicpc.net/problem/2153
// BOJ_2153_소수단어

#include <stdio.h>
char word[21];
int num, cnt;
int main() {
    scanf("%s", word);
    for(int i = 0; i < 20; i++){
        if(word[i] >= 'A' && word[i] <= 'Z')
            num += word[i] - 38;
        else if(word[i] >= 'a' && word[i] <= 'z')
            num += word[i] - 96;

    }
    if(num == 1) cnt++;
    for(int i = 1; i <= num; i++){
        if(num % i == 0){
            cnt++;
        }
    }
    if(cnt == 2) printf("It is a prime word.");
    else printf("It is not a prime word.");
    return 0;
}