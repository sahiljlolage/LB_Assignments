/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept string from user & count white spaces.  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int WhiteSpace(char *str)
{
    int iCnt = 0;
    
    if(*str == '\0')
    {
       return 0;
    }

    iCnt = (*str == ' ' || *str == '\t' || *str == '\n' || *str == '\r') ? 1 : 0;

    return iCnt + WhiteSpace(str+1);
}

int main()
{
    char arr[20];

    printf("Enter string ");
    scanf("%[^'\n']s",arr);
   
    int iRet = WhiteSpace(arr);
    printf("%d",iRet);

    return 0;
}
