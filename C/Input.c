#include <stdio.h>

int main()
{
    // Sum of two number
    int a, b;
    printf("enter a \n");
    scanf("%d", &a);
    printf("enter b \n");
    scanf("%d", &b);
    printf("sum of a & b is : %d \n", a + b);

    // Area of Square
    int side;
    printf("Enter length of side of square: ");
    scanf("%d", &side);
    printf("Area of square is %d\n", side * side);

    // Area of Circle
    float radius;
    printf("Enter radius of circle: ");
    scanf("%f", &radius);
    printf("Area of circle is %f\n", 3.14 * radius * radius);
    return 0;
}