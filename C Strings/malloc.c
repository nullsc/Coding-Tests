#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("Enter numbers");
    int *p;
    int n = 5;
    p = (int*)malloc(n* sizeof(int));
    
    for(int i=0; i<5; i++){
        scanf("%d", &p[i]);
    }
    
    p = realloc(p, (n + 1) * sizeof(int)); //add one
    for(int i=0; i<6; i++){
        printf("[%d] %d \n", i, p[i]);
    }
   
    free(p);
    

    return 0;
}
