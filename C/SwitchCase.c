#include <stdio.h>

int main()
{
    // Integer

    int day1 = 5;

    switch (day1)
    {
    case 1:
        printf("monday \n");
        break;
    case 2:
        printf("tuesday \n");
        break;
    case 3:
        printf("wednesday \n");
        break;
    case 4:
        printf("thursday \n");
        break;
    case 5:
        printf("friday \n");
        break;
    case 6:
        printf("saturday \n");
        break;
    case 7:
        printf("sunday \n");
        break;
    }

    // Character

    char day2 = 'f';

    switch (day2)
    {
    case 'm':
        printf("monday \n");
        break;
    case 't':
        printf("tuesday \n");
        break;
    case 'w':
        printf("wednesday \n");
        break;
    case 'T':
        printf("thursday \n");
        break;
    case 'f':
        printf("friday \n");
        break;
    case 's':
        printf("saturday \n");
        break;
    case 'S':
        printf("sunday \n");
        break;
    }

    return 0;
}