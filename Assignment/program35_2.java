////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept number from user and return the count of even digits. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Digit
{
    public int CountOdd(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit %2 != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class program35_2
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountOdd(iValue);
        System.out.println("Number of Odd Digits are : "+iRet);

        sobj.close();
    }
}
