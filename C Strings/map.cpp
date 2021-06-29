/******************************************************************************

*******************************************************************************/

#include <iostream>
#include <map>
#include <utility>

using namespace std;

int main()
{
    cout<<"Hello World";

    map<char, pair<int, int>> test{
        {'a', make_pair(1,2)},
        {'b', make_pair(2,8)},
        {'c', make_pair(3,2)}
    };
    
    cout << test['b'].second; //first
    
    
    return 0;
}
