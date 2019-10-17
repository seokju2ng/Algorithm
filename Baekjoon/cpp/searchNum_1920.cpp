// https://www.acmicpc.net/problem/1920
// BOJ_1920_수 찾기

#include <stdio.h>
#include <stdlib.h>
int a[100000], n;
void BinarySearch(int key);
int compare(const void *a, const void *b)
{
    int num1 = *(int *)a;
    int num2 = *(int *)b;
    if (num1 < num2) return -1;
    if (num1 > num2) return 1;
    return 0;
}
int main(){
    int m, is;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%d", &a[i]);
    }
    qsort(a, n, sizeof(int), compare);
    scanf("%d", &m);
    for(int i = 0; i < m; i++){
        scanf("%d", &is);
        BinarySearch(is);
    }
    return 0;
}
void BinarySearch(int key){
    int left = 0,
        right = n - 1,
        mid;
    while(right >= left){
        mid = (left + right) / 2;
        if(a[mid] == key){
            printf("1\n");
            return;
        }
        else if(a[mid] > key) right = mid-1;
        else left = mid + 1;
    }
    printf("0\n");
}
