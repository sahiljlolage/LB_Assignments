/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which display below pattern.        
/*
        *   *   *   *   *
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    static int iCnt = 1;

    if(iCnt <= iNo)
    {
        printf("*\t");
        iCnt++;
        Display(iNo);  // Recursive call
    }
}

int main()
{
    int iValue = 0;

    printf("Enter number ");
    scanf("%d",&iValue);
   
    Display(iValue);

    return 0;
}
