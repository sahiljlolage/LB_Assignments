/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept number from user & return largest digit.  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Max(int iNo)
{
   if(iNo == 0)
   {
    return 0;
   }
    
    int iDigit = iNo % 10;
    iNo = iNo / 10;
    int iMax = Max(iNo);

    if(iDigit > iMax)
    {
        return iDigit;
    }
    else
    {
        return iMax;
    }
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);
   
    iRet = Max(iValue);
    printf("%d",iRet);

    return 0;
}
