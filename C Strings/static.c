/******************************************************************************

*******************************************************************************/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *getOS1(){
    static char os[10]; //stays the whole program execution
    strcpy(os, "[win]");
    return os;
}

char *getOS(){
    char *os = (char*)malloc(10*sizeof(char));
    strcpy(os, "[win10]");
    return os;
}

char *getCountry(){
    static char country[10];
    strcpy(country, "[usa]");
    return country;
}

void gen(char *buffer){
    char ret[20];
    char *os = getOS();
    //sprintf(ret, "%s%s test", getOS1(), getCountry());
    sprintf(ret, "%s%s test", os, getCountry());
    strcpy(buffer, ret);
    free(os);
}

int main()
{
    char test[20];
    gen(test);
    printf("Name: %s", test);

    return 0;
}
