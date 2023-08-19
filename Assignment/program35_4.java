////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept number from user and return multiplication of all digits.  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Digit
{
    public int CountRange(int iNo)
    {
        int iDigit = 0;
        int iMult = 1;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }
        return iMult;
    }
}

class program35_4
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountRange(iValue);
        System.out.println("Multiplication of all digits is  : "+iRet);

        sobj.close();
    }
}
