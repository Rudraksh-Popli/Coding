#include <iostream>

using namespace std;
int main()
{
    /*Loops in C++:
    There are three types of loops in C++:
        1. For loop
        2. While Loop
        3. do-While Loop
    */

    /*For loop in C++*/
    // int i=1;
    // cout<<i;
    // i++;

    // Syntax for for loop
    // for(initialization; condition; updation)
    // {
    //     loop body(C++ code);
    // }

    // for (int i = 1; i <= 40; i++)
    // {
    //     /* code */
    //     cout<<i<<endl;
    // }

    // Example of infinite for loop
    // for (int i = 1; 34 <= 40; i++)
    // {
    //     /* code */
    //     cout<<i<<endl;
    // }

    /*While loop in C++*/
    // Syntax:
    // while(condition)
    // {
    //     C++ statements;
    // }

    //  Printing 1 to 40 using while loop
    // int i=1;
    // while(i<=40){
    //     cout<<i<<endl;
    //     i++;
    // }

    // Example of infinite while loop
    // int i = 1;
    // while (true)
    // {
    //     cout << i << endl;
    //     i++;
    // }

    /* do While loop in C++*/
    // Syntax:
    // do
    // {
    //     C++ statements;
    // }
    // while(condition);

    //  Printing 1 to 40 using while loop
    // int i=1;
    // do
    // {
    //     cout<<i<<endl;
    //     i++;
    // }
    // while(false);

    int n = 6;

    int i = 0;

    // for (int i = 0; i < 11; i++)
    // {
    //     cout<<n*i<<endl;
    // }

    // cout<<endl;

    // while (i<11)
    // {
    //     cout<<n*i<<endl;
    //     i++;
    // }

    // cout<<endl;

    do
    {
        cout << n * i << endl;
        i++;
    }

    while (i < 11);

    return 0;
}