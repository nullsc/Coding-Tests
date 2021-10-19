/******************************************************************************


*******************************************************************************/

#include <stdio.h>
#include <string.h>


typedef struct student {
    int id;
    unsigned int age;
    char name[20];
} student;

int getage(student *s){
    return s->age;
}

void printStudent(student *s){
    printf("ID: %d \n"\
        "Name: %s \n"\
        "Age: %d \n", s->id, s->name, s->age);
}

void prnt(char *str){
    str[0] = '1';
    printf("%s \n", str);
}

void change(char **ptr){
    *ptr = "new pointer";
}

char *gen(int len){
    char *str = (char*)malloc(sizeof(char) * len + 1);
    for(int i =0; i< len; i++){
        str[i] = '0';
    }
    str[len-1] = '/0';
    return str;
    
}

int main()
{
    char hello[] = "Hello";
    char *he = "orignal pointer"; 
    printf("%s \n", he);
    change(&he);
    printf("%s \n", he);
    
    prnt(hello);
    char *a = (char*)malloc(100);
    strcpy(a, "This is a string");
    printf("%s \n", a);
    free(a); // deallocate memory 

    char *astring = gen(50);
    printf("A string: %s \n", astring);
    free(astring);
    
    //student Student = {0, 25, "student"};
    student Student = {0};
    Student.id = 0;
    Student.age = 20;
    strcpy(Student.name, "person1");
    printf("Student age: %d \n", getage(&Student));
    printStudent(&Student);

    return 0;
}
