////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept number from user and return diifernce between summation
// of even digits and summation odd digits.  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Digit
{
    public int CountDiff(int iNo)
    {
        int iDigit = 0;
        int iSum1 = 0,iSum2 = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSum1 = iSum1 + iDigit;
            }
            else if(iDigit % 2 != 0)
            {
                iSum2 = iSum2 + iDigit;
            }
            iNo = iNo / 10;
        }
        return iSum1 - iSum2;
    }
}

class program35_5
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountDiff(iValue);
        System.out.println("Difference is : "+iRet);

        sobj.close();
    }
}
