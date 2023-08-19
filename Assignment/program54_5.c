/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept number from user & return its product of digits.  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Mult(int iNo)
{
    int iDigit = 0;
    static int iProd = 1;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iProd = iProd * iDigit;
        iNo = iNo / 10;
        Mult(iNo);
    }
    return iProd;
}

int main()
{
    int iRet = 0,iValue = 0;
    
    printf("Enter number ");
    scanf("%d",&iValue);
   
    iRet = Mult(iValue);
    printf("%d",iRet);

    return 0;
}
