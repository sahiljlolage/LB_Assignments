////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept number from user and return the count of even digits. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Digit
{
    int CountEven(int iNo)
    {
        int iCount = 0;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class program35_1
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int iValue = sobj.nextInt();
        
        Digit dobj = new Digit();

        int iRet = dobj.CountEven(iValue);
        System.out.println("Number of even digits are : "+iRet);

        sobj.close();
    }
}