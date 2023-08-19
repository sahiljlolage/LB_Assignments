/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number of rows and number of columns from user and display 
// below pattern.
/*
        1   1   1   1   
        2   2   2   2   
        3   3   3   3   
        4   4   4   4   
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

        for(i = 1; i <= iRow; i++)
        {
            for (j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }        
    }
}

class program39_5
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
