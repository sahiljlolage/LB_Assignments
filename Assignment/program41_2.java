/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number of rows and number of columns from user and display 
// below pattern.
/*
         Hello
         H   e   l   l   o    
         H   e   l   l   *    
         H   e   l   *   *
         H   e   *   *   *
         H   *   *   *   *  
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
    void Display(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < str.length(); j++)
            {
                if( j < str.length() - i)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else 
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}

class program41_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = sobj.nextLine();
        
        Pattern pobj = new Pattern();

        pobj.Display(s);
     
        sobj.close();
    }
}
