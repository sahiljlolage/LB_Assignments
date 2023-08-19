/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number of rows and number of columns from user and display 
// below pattern.
/*
 *      A   A   A   A   A
 *      B   B   B   B   B
 *      C   C   C   C   C
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
    public Pattern(int iRow, int iCol)
    {
        int X = iRow;
        int Y = iCol;
    }

    void Display(int iRow,int iCol)
    {
        int i = 0, j = 0;
        char ch = 'A';
        for(i = 1; i<= iRow; i++,ch++)
        {
            for (j = 1; j<= iCol; j++)
            {
                System.out.print(ch+"\t");
            }
            System.out.println();
        }

        
    }
}

class program38_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter no. of rows  : ");
        int iValue1 = sobj.nextInt();
        
        System.out.println("Enter no. of columns  : ");
        int iValue2 = sobj.nextInt();
        
        Pattern pobj = new Pattern(iValue1,iValue2);

        pobj.Display(iValue1, iValue2);
     
        sobj.close();
    }
}
