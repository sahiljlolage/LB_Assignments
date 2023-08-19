/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept number from user & return largest digit.  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Min(int iNo)
{
   if(iNo < 10)
   {
        return iNo;
   }
    
    int iDigit = iNo % 10;
    iNo = iNo / 10;
    int iMin = Min(iNo);

    if(iDigit < iMin)
    {
        return iDigit;
    }
    else
    {
        return iMin;
    }
}

int main()
{
    int iValue = 0, iRet = 0;

    printf("Enter number ");
    scanf("%d",&iValue);
   
    iRet = Min(iValue);
    printf("%d",iRet);

    return 0;
}
