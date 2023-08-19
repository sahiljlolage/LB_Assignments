/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which accept number from user & return its factorial.  
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

int Fact(int iNo)
{

    if(iNo == 0 || iNo == 1)
    {
        return 1;
    }
    else
    {
        return iNo * Fact(iNo - 1);
    }
}

int main()
{
    int iRet = 0,iValue = 0;
    
    printf("Enter number ");
    scanf("%d",&iValue);
   
    iRet = Fact(iValue);
    printf("%d",iRet);

    return 0;
}
