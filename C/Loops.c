#include <stdio.h>

int main()
{
    // for loop

    for (int i = 1; i <= 100; i++)
    {
        printf("%d\n", i);
    }

    printf("\n");

    // while loop

    int i = 1;

    while (i <= 100)
    {
        printf("%d\n", i);
        i++;
    }

    printf("\n");

    // do while loop

    i = 1;

    do
    {
        printf("%d\n", i);
        i++;
    } while (i <= 100);

    printf("\n");

    return 0;
}