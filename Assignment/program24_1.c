/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a program which accept string from user and accept one character.Check whether
// that character is present in string or not.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdbool.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkChar(char *str,char ch)
{
    while(*str != '\0')
    {
        if(*str == ch)
        {
            break;
        }
        str++;
    }

    if(*str != '\0')
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }

}

int main()
{
    char arr[20];
    char cValue;
    BOOL bRet = FALSE;
    
    printf("Enter the string ");
    scanf("%[^'\n']s",arr);

    printf("Enter the character ");
    scanf(" %c",&cValue);

    bRet = ChkChar(arr,cValue);

    if(bRet == TRUE)
    {
        printf("Character found");
    }
    else
    {
        printf("Character not found");
    }
    
    return 0;

}