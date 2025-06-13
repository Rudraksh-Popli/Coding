#include <stdio.h>
#include <string.h>

// void printString(char arr[]);
// int countLength(char arr[]);
// void salting(char password[]);
// void slice(char str[], int n, int m);
// int countVowels(char str[]);

void checkChar(char str[], char ch);

int main()
{
    // declaration

    char name1[] = "Shradha Khapra";
    char course[] = {'a', 'p', 'n', 'a', ' ', 'c', 'o', 'l', 'l', 'e', 'g', 'e', '\0'};

    // printing string

    for (int i = 0; name1[i] != '\0'; i++)
    {
        printf("%c", name1[i]);
    }
    printf("\n");

    // printing string with pointer

    for (char *ptr = name1; *ptr != '\0'; ptr++)
    {
        printf("%c", *ptr);
    }
    printf("\n");

    // printing using format specifier

    printf("%s\n", name1);

    // input a string

    char firstName[40];
    printf("enter first name : ");
    scanf("%s", firstName);
    printf("you first name is %s\n", firstName);
    char fullName1[40];
    printf("enter full name : ");
    scanf("%s", fullName1);
    printf("you first name is %s\n", fullName1);

    // gets & puts

    char fullName2[40];
    printf("enter full name : ");
    fgets(fullName2, 40, stdin);
    puts(fullName2);

    // Library Functions

    char name2[] = "Shradha";
    int length = strlen(name2);
    printf("the length of name : %d\n", length);
    char oldVal[] = "oldValue";
    char newVal[50];
    strcpy(newVal, oldVal);
    puts(newVal);
    char firstStr[50] = "Hello ";
    char secStr[] = "World";
    strcat(firstStr, secStr);
    puts(firstStr);
    char str1[] = "Apple";
    char str2[] = "Banana";
    printf("%d\n", strcmp(str1, str2));

    // enter String using %c

    printf("enter string : ");
    char str100[100];
    char ch1;
    int i = 0;
    while (ch1 != '\n')
    {
        scanf("%c", &ch1);
        str100[i] = ch1;
        i++;
    }
    str100[i] = '\0';
    puts(str100);

    // check for presence of character

    char str[] = "ApnaCollege";
    char ch2 = 'x';
    checkChar(str, ch2);

    return 0;
}

void checkChar(char str[], char ch)
{
    for (int i = 0; str[i] != '\0'; i++)
    {
        if (str[i] == ch)
        {
            printf("character is present!");
            return;
        }
    }
    
    printf("character is NOT present:(");
}

// int countVowels(char str[])
// {
//     int count = 0;
//     for (int i = 0; str[i] != '\0'; i++)
//     {
//         if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' ||
//             str[i] == 'o' || str[i] == 'u')
//         {
//             count++;
//         }
//     }
//     return count;
// }

// void slice(char str[], int n, int m)
// {
//     // n & m are valid values

//     char newStr[100];
//     int j = 0;
//     for (int i = n; i <= m; i++, j++)
//     {
//         newStr[j] = str[i];
//     }
//     newStr[j] = '\0';

//     puts(newStr);
// }

// void salting(char password[])
// {
//     char salt[] = "123";
//     char newPass[200];
//     strcpy(newPass, password); // newPass = "test"
//     strcat(newPass, salt);     // newPass = "test" + "123";

//     puts(newPass);
// }

// int countLength(char arr[])
// {
//     int count = 0;
//     for (int i = 0; arr[i] != '\0'; i++)
//     {
//         count++;
//     }

//     return count - 1;
// }

// void printString(char arr[])
// {
//     for (int i = 0; arr[i] != '\0'; i++)
//     {
//         printf("%c", arr[i]);
//     }

//     printf("\n");
// }