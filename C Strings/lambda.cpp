/******************************************************************************

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int c = 1;
    auto x = [&c](){
        return c + 9;
    }();
//int x = [] (int x, int y) { return x + y; }(5, 4);
   //cout << x << endl;
    

    cout<< x;
// prints 10
    return 0;
}

/*
[capture clause](args){functions}
[&c] pass c reference
[&] pass all variables by reference
[=] pass variables by value
*/
