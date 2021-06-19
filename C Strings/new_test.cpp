/******************************************************************************

*******************************************************************************/

#include <iostream>

using namespace std;

void sqr(int *num){
    *num = *num * *num;
}

void rot13(const char *str){
//print out rot13 string
    for(int i=0; i<strlen(str); i++){
        if(str[i] >= 'a' && str[i] <= 'z'){ //lowercase
            if(str[i] >= 'a' && str[i] <= 'm'){
                printf("%c", str[i] + 13);
            } else {
                printf("%c", str[i] - 13);
            }
        } 
        else if(str[i] >= 'A' && str[i] <= 'Z'){ //uppercase
            if(str[i] >= 'A' && str[i] <= 'M'){
                printf("%c", str[i] + 13);
            } else {
                printf("%c", str[i] - 13);
            }
        } else { //special char, keep it the same
            printf("%c", str[i]);
        }
    }
    printf("\n");
}

int main()
{
    int x = 5;
    sqr(&x);
    //cout<<x;
    
    int numItems;
    cout << "How many items?";
    cin >> numItems;
    
    int *arr = new int[numItems]; //dynamic int array
    for(int i=0; i<numItems; ++i){
        cout<< "Enter item "<< i << ": ";
        cin>> arr[i];
    }
    
    for(int i = 0; i < numItems; ++i) { //print it out
        cout<< arr[i] << endl;
        
    }
    delete[] arr;

    return 0;
}
