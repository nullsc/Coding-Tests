/******************************************************************************


*******************************************************************************/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int findFirst(char *str, char c){
    for(int i=0; i<strlen(str); i++){
        if(str[i] == c)
            return i;
    }
    return -1;
}

// test@abc
// 01234567
char **splitIn2(char *str, char c){
    if(findFirst(str, c) == -1)
        return NULL;
        
    size_t index = findFirst(str, c);
    char **ret = malloc(2 * sizeof(char*));
    ret[0] = malloc((index + 1) * sizeof(char));
    ret[1] = malloc((strlen(str)-(index + 1)) * sizeof(char));
    strncpy(ret[0], str, index);
    strncpy(ret[1], str + index +1, strlen(str)-(index)); // str + index + 1 to omit the split char
    
    return ret;
}

int main()
{
    char test[] = "test";
    char * test1 = "qwerty@abc";
    
    char **spl = splitIn2(test1, '@');
    printf("%d \n", findFirst(test1, 'y'));
    printf("Split: %s, %s", spl[0], spl[1]);
    
    return 0;
}
