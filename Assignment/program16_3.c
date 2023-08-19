/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Accept number of rows and number of columns from user and display below pattern.
/////////////////////////////////////////////////////////////////////////////////////////////////////
/*
    Output :

            A   A   A   A   A   
            B   B   B   B   B   
            C   C   C   C   C       
        
*/

#include<stdio.h>

void Pattern(int iRow, int iCol)
{
    int i = 0, j = 0;
    char ch = 'A';
    
    for(i = 1; i <= iRow; i++,ch++)
    {
        
        for(j = 1; j <= iCol; j++)
        {
            printf("%c\t",ch);
        }
        
        printf("\n");
        
    }
}

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter number of rows and columns ");
    scanf("%d %d",&iValue1,&iValue2);

    Pattern(iValue1, iValue2);
       
    return 0;

}