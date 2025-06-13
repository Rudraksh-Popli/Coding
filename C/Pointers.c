#include <stdio.h>

void square(int n);
void _square(int *n);

void swap(int a, int b);
void _swap(int *a, int *b);

int main()
{
    int age1 = 22;
    int *ptr1 = &age1;
    int _age1 = *ptr1;
    printf("%d\n", _age1);
    // address
    printf("%p\n", &age1);
    printf("%p\n", ptr1);
    printf("%p\n", &ptr1);
    // data
    printf("%d\n", age1);
    printf("%d\n", *ptr1);
    printf("%d\n", *(&age1));
    
    // Pointer Arithmetic

    int age2 = 22;
    int *ptr2 = &age2;
    int _age2 = 25;
    int *_ptr2 = &_age2;
    printf("%u\n", ptr2);
    ptr2++;
    printf("%u\n", ptr2);
    ptr2--;
    printf("%u\n", ptr2);
    ptr2 = ptr2 - _ptr2;
    printf("%u\n", ptr2);
    ptr2 = &_age2;
    printf("%d\n", ptr2 == _ptr2);

    // Pointers in Function Call

    int number = 4;
    // call by value
    square(number);
    printf("n is : %d\n", number);
    // call by reference
    _square(&number);
    printf("n is : %d\n", number);

    // Pointers in Swapping Two Numbers

    int x = 3, y = 5;
    // call by value
    swap(x, y);
    printf("x = %d & y = %d\n", x, y);
    // call by reference
    _swap(&x, &y);
    printf("x = %d & y = %d\n", x, y);

    return 0;
}

void square(int n)
{
    n = n * n;
    printf("square is : %d\n", n);
}

void _square(int *n)
{
    *n = *n * *n;
    printf("square is : %d\n", *n);
}

void swap(int a, int b)
{
    int t = a;
    a = b;
    b = a;
}

void _swap(int *a, int *b)
{
    int t = *a;
    *a = *b;
    *b = *a;
}