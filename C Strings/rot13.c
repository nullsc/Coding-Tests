/******************************************************************************


*******************************************************************************/

#include <stdio.h>

void rot13(char *str){ //edit string in place
    for(int i=0; i<strlen(str); i++){
        if(str[i] >= 'a' && str[i] <= 'z'){ //lowercase
            if(str[i] >= 'a' && str[i] <= 'm'){
                str[i] = str[i] + 13;
            } else {
                str[i] = str[i] - 13;
            }
        } 
        else if(str[i] >= 'A' && str[i] <= 'Z'){ //uppercase
            if(str[i] >= 'A' && str[i] <= 'M'){
                str[i] = str[i] + 13;
            } else {
                str[i] = str[i] - 13;
            }
        } else { //special char, keep it the same
            //printf("%c", str[i]); do nothing
        }
    }
}

void edit(char *n){ //test, change first char
    n[0] = '#';
}

int main()
{
    char test[] = "uryyb!"; // hello!
  //char test[] = "abcdefghijklmnopqrstuvwxyz";
    rot13(test);
    printf("%s \n", test);
    return 0;
}
