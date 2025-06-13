#include <stdio.h>

int main()
{
    int age1 = 19;
    if (age1 >= 18)
    {
        printf("you are an adult\n");
    }
    else
    {
        printf("you are not an adult\n");
    }

    // Check if a number is odd or even

    int number;
    printf("Enter a number: ");
    scanf("%d", &number);
    if (number % 2 == 0)
    {
        printf("given number is even\n");
    }
    else
    {
        printf("given number is odd\n");
    }

    // Use of Else-If

    int age2;
    printf("Enter age : ");
    scanf("%d", &age2);
    if (age2 < 12)
    {
        printf("child");
    }
    else if (age2 < 18)
    {
        printf("teenager");
    }
    else
    {
        printf("adult");
    }

    return 0;
}