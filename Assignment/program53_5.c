/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a recursive program which display below pattern.        
/*
        a   b   c   d   e   f
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>

void Display(int iNo)
{
    if(iNo <= 0)
    {
        return;
    }
    else
    {
        Display(iNo - 1);
        printf("%c\t",'a'+ iNo - 1);
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
