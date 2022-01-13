/******************************************************************************

*******************************************************************************/
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool startsWith(char first[], char second[]) {
    if(first == NULL || second == NULL)
        return false;
        
    if(strlen(second) > strlen(first))
        return false;
        
    for(int i=0; i<strlen(second); i++) {
        if(first[i] != second[i])
            return false;
    }
    return true;    
}

int main()
{
    char * test = "test string";
    
    if(startsWith("Hello", "He"))
        printf("Match \n");

    if(startsWith(test, "te"))
        printf("Match: %s: te", test);
        
    return 0;
}
