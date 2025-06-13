#include <stdio.h>

// function declaration/prototype

void printHello();      // Function to print "Hello!"
int calcSquare(int n); // Function to calculate square of a number

int main()
{
    // function call
    printHello();

    int n;
    printf("enter n : ");
    scanf("%d", &n);    
    printf("square is : %d", calcSquare(n));

    return 0;
}

// function definition
void printHello()
{
    printf("Hello!\n");
}

int calcSquare(int n)
{
    return n * n;
}