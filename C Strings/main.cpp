// 26/01/2020

#include <iostream>
#include <stdio.h>
#include "includes.h";


int main()
{
	const char *welcome = "   Welcome message";
	char welcome2[20] = "   Welcome you!";
	char *am = (char*)malloc(sizeof(char) * 200); //allocate memory on the heap
	strcpy_s(am, 200, "This is a dynamically allocated string");
	printf("%s \n", am);
	free(am);
	
	printf("%s len= %d\n", welcome, sLen(welcome)); //prints out the string


	printf("Trim: %s\n", ltrim(welcome2));
	printf("Trim pointer: %s\n", ltrim2(welcome));


	getchar();

	return 0;
}

int sLen(const char* str)
{
  /*returns the string length*/
	int i = 0;
	while (*str != '\0') {
		str++;
		i++;
	}

	return i;
}

char* ltrim(char* str) 
{
	/*
  Left trim
  doesn't work with const char
	Works for char[]
	*/
	if (str[0] == '\0')
		return NULL;
	while (isspace(*str)) {
		str++;
	}
	return str;
}

char* ltrim2(const char* str)
{
	/*
	For const char pointers
	*/
	char* trimmed = (char*)malloc(sizeof(char) * 200); //allocate memory on the heap
	
	if (str[0] == '\0')
		return NULL;
	while (isspace(*str)) {
		str++;
	}
	strcpy_s(trimmed, strlen(str) + 1, str); //returns the copied string, need to fix
	return trimmed;
}
