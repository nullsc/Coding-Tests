/******************************************************************************

*******************************************************************************/
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

/* Checks if a string starts with a substring 
@returns true or false
*/
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

/* Checks if a string ends with a substring */
bool endsWith(char first[], char second[]) {
    if(first == NULL || second == NULL)
        return false;
        
    if(strlen(second) > strlen(first))
        return false;

    
    int j = strlen(first) - 1;
	for (int i = strlen(second) - 1; i >= 0; i--) {
	    printf("%c : %c \n", first[j], second[i]);
		if (first[j] != second[i])
			return false;
		j--;
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
        
    if(endsWith("hello.exe", "exe"))
        printf("Match end \n");
    
    return 0;
}
