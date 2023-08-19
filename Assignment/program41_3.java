/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number of rows and number of columns from user and display 
// below pattern.
/*
         Hello
         H   #   #   #   #  
         H   e   #   #   #
         H   e   l   #   #
         H   e   l   l   #    
         H   e   l   l   o    
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
                if(i == j || i > j)
                {
                    System.out.print(str.charAt(j)+"\t");
                }
                else 
                {
                    System.out.print("#\t");
                }
            }
            System.out.println();
        }
    }
}

class program41_3
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
