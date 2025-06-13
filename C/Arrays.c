#include <stdio.h>

void printNumbers(int *arr, int n);
void _printNumbers(int arr[], int n);

int main()
{
    int marks[3];
    printf("physics : ");
    scanf("%d", &marks[0]);
    printf("chemistry : ");
    scanf("%d", &marks[1]);
    printf("math : ");
    scanf("%d", &marks[2]);
    printf("physics = %d, ", marks[0]);   // physics
    printf("chemistry = %d, ", marks[1]); // chemistry
    printf("math = %d \n", marks[2]);     // math

    // Accessing an Array

    int arr[] = {1, 2, 3, 4, 5, 6};
    printNumbers(arr, 6);
    printNumbers(arr, 6);

    return 0;
}

void printNumbers(int *arr, int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d : %d\n", i, arr[i]);
    }
}

void _printNumbers(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("%d : %d\n", i, arr[i]);
    }
}