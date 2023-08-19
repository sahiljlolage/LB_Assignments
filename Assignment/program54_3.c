/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept string from user & count number of  
// characters.       
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Strlen(char *str)
{
    static int iCnt = 0;

    if(*str != '\0')
    {
        iCnt++;
        str++;
        Strlen(str);
    }
    return iCnt;
}

int main()
{
    int iRet = 0;
    char arr[20];

    printf("Enter string ");
    scanf("%s",&arr);
    
   
    iRet = Strlen(arr);
    printf("%d",iRet);

    return 0;
}
