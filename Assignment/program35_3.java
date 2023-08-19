////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept  number from user and return the count of digits in 
// between 3 and 7. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class Digit
{
    public int CountRange(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > 3 && iDigit < 7)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class program35_3
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int iValue = sobj.nextInt();

        Digit dobj = new Digit();

        int iRet = dobj.CountRange(iValue);
        System.out.println("Number of Digits between 3 & 7 are : "+iRet);

        sobj.close();
    }
}
