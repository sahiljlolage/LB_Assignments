/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept string from user & count number of small characters.  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Small(char *str)
{
    int iCnt = 0;

   if(*str == '\0')
   {
        return 0;
   }

    iCnt = (*str >= 'a' && *str <= 'z') ? 1: 0;
    
    return iCnt + Small(str + 1);

}

int main()
{
    int iRet = 0;
    char arr[40];

    printf("Enter string ");
    scanf("%s",&arr);
    
   
    iRet = Small(arr);
    printf("%d",iRet);

    return 0;
}
