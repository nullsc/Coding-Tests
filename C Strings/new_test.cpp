/******************************************************************************

*******************************************************************************/

#include <iostream>

using namespace std;

void sqr(int *num){
    *num = *num * *num;
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
