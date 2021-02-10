/******************************************************************************

Generates an array of random integers, then tells you the largest and second largest numbers

*******************************************************************************/
#include <stdio.h>
#include <stdlib.h>
#include <time.h> // Enables use of time()


int main() {
    int i;
    int numarray[10]; //int array
    int first = 0;
    int second = 0;
    
    srand((int)time(0)); // Unique seed
    
    for (i=0; i<10 ;i++) {
        numarray[i] = (rand()%100)+1; //generate a random number
        printf("%d ", numarray[i]); //print as we go along
        if (numarray[i] > first){
            second = first; //largest number is now the second
            first = numarray[i]; //i becomes the largest
        }
            
        if (numarray[i] > second && numarray[i] < first) //if it's larger than 2nd but not larger than first, it goes straight to 2nd
            second = numarray[i];
    }
    printf("\n");
    printf("Largest: %d \n", first);
    printf("Second: %d \n", second);
    
    return 0;
}
