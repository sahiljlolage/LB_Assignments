/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept number of rows and number of columns from user and display 
// below pattern.
/*
         Hello
    H  
    H   e   
    H   e   l   
    H   e   l   l   
    H   e   l   l   o
    H   e   l   l   
    H   e   l      
    H   e   l   
    H   e 
    H  
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Pattern
{
    public Pattern(String str)
    {
        String s1 = str;
    }

    void Display(String str)
    {
        for(int i = 0; i< str.length(); i++)
        {
            for(int j = 0; j < str.length(); j++)
            {
                if(i >= j)
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }

        for(int i = 1; i< str.length(); i++)
        {
            for(int j = 0; j < str.length() - i; j++)
            {
                System.out.print(str.charAt(j)+"\t");
            }
            System.out.println();
        }    
    }
}

class program40_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string: ");
        String s = sobj.nextLine();
        
        Pattern pobj = new Pattern(s);

        pobj.Display(s);
     
        sobj.close();
    }
}
