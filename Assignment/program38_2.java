/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number of rows and number of columns from user and display 
// below pattern.
/*
 *      A   B   C   D
 *      a   b   c   d
 *      A   B   C   D
 *      a   b   c   d
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

        if(iRow != iCol)
        {
            System.out.println("Invalid input !");
            return;
        }
        
        for(i = 1; i<= iRow; i++)
        {
            char ch1= 'a';
            char ch2= 'A';
            for (j = 1; j<= iCol; j++)
            {
                if(i % 2 == 1)
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
                
            }
            System.out.println();
        }

        
    }
}

class program38_2
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
