#Divisible Sum Pairs
#You are given an array of n integers, a0, a1 ----an-1, and a positive integer, k. Find and print the number of (i,j) pairs where i<j and ai + aj is evenly divisible by
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n;
    int k;
    scanf("%d %d",&n,&k);
    int *a = malloc(sizeof(int) * n);
    for(int a_i = 0; a_i < n; a_i++){
       scanf("%d",&a[a_i]);
    }
    return 0;
}
