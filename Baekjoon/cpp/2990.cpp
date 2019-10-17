// 작성자: 김석중. 2990.cpp.
// http://www.acmicpc.net/problem/2990
// BOJ_2990_단어 검색
#include <cstdio>
#include <cstdlib>
#include <cstring>

int n, m;
char s[32];
char a[30000][32];

char sorted[30000][32];
int counter[30000][32];
int before[30000][32];
int id[30000];

int cmp( const void *e1, const void *e2 ) {
    return strcmp( (const char *)e1, (const char *)e2 );
}

int find_border( char x, int column, int lo, int hi ) {
    if( x > sorted[hi-1][column] ) return hi;

    while( lo + 1 < hi ) {
        int mid = (lo+hi-1)/2;
        if( x > sorted[mid][column] ) lo = mid+1; else hi = mid+1;
    }

    return lo;
}

int begin[32], end[32];

int search( char *s, int column, int lo, int hi ) {
    begin[column] = end[column] = -1;

    if( s[column] == 0 ) return sorted[lo][column] == 0 ? lo : -1;

    begin[column] = find_border( s[column], column, lo, hi );
    end[column] = find_border( s[column]+1, column, lo, hi );

    if( begin[column] == end[column] ) return -1;

    return search( s, column + 1, begin[column], end[column] );
}

int main( void ) {
    scanf( "%d", &n );
    for( int i = 0; i < n; ++i ) {
        scanf( "%s", a[i] );
        strcpy( sorted[i], a[i] );
    }
    qsort( sorted, n, 32, cmp );

    for( int i = 0; i < n; ++i ) {
        int row = search( a[i], 0, 0, n );
        id[row] = i+1;

        for( int column = 0; begin[column] < end[column]; ++column )
            before[row][column] = ++counter[begin[column]][column];
    }

    scanf( "%d", &m );
    for( int qq = 0; qq < m; ++qq ) {
        scanf( "%s", s );

        int ret = 0;
        int row = search( s, 0, 0, n );
        if( row == -1 ) {
            ret += n;
            for( int column = 0; begin[column] < end[column]; ++column )
                ret += counter[begin[column]][column];
        } else {
            ret += id[row];
            for( int column = 0; s[column]; ++column )
                ret += before[row][column];
        }

        printf( "%d\n", ret );
    }

    return 0;
}

/*
#include <stdio.h>
#include <string.h>
#define MAX 30000
#define WORD_LENGTH 30
char words[MAX][WORD_LENGTH];
int compareNum[MAX];
int main() {
    int n, q, cnt, left, right, mid, ncmp;
    char search[WORD_LENGTH];
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", words[i]);
    }
    scanf("%d", &q);
    for(int i = 0; i < q; i++){
        scanf("%s", search);
        cnt = 0;
        for(int j = 0; j < n; j++){
            if(!strcmp(search, words[j])){
                compareNum[i] = strlen(search) + 1;
                break;
            }
            if(search[0] != words[j][0]){ cnt++; continue;}
            left = 0; right = strlen(search)-1;
            while(1){
                mid = (left + right) / 2;
                ncmp = strncmp(search, words[j], mid);
                if(ncmp == 0){ // mid까지 같고
                    if(search[mid + 1] == 0){ // 마지막 글자고
                        if(words[j][mid+1] == 0) cnt += mid+2; // 같은 단어라면
                        else cnt += mid+2;
                        break;
                    }
                    else{
                        left = mid + 1;
                        if(left > right){
                            cnt = cnt + mid + 1;
                            break;
                        }
                    }
                    /*
                    if(search[mid+1] == words[j][mid+1]){
                        if(search[mid+1] == 0) {
                            cnt += mid;
                            break;
                        }
                        else
                    }
                    left = mid + 1;
                     *//*
                }
                else {
                    right = mid -1;
                    if(left > right){
                        cnt = cnt + mid + 1;
                        break;
                    }
                }
            }*/
            /*
            for(int k = 0; k < WORD_LENGTH; k++){
                cnt++;
                if(search[k] == words[j][k]){
                    if(search[k] == 0){
                        compareNum[i] = cnt;
                        break;
                    }
                }
                else break;
            }
            */
            //if(compareNum[i] != 0) break;
        /*}
        if(compareNum[i] == 0) compareNum[i] = cnt;
    }
    for(int i = 0; i < q; i++){
        printf("%d\n", compareNum[i]);
    }
    return 0;
}
*/