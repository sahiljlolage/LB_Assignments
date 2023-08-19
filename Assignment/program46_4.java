////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array of characters from user and count 
// number of capital letters .
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    int ArrayCapital(char arr[])
    {
        int iCnt = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            {
                iCnt++;
            }
        }
        return iCnt;
    }

}   
class program46_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int iValue1 = sobj.nextInt();
        
       char Arr[] = new char[iValue1];
       
       System.out.println("Enter Characters ");
       for(int i = 0; i< Arr.length; i++)
       {
           Arr[i] = sobj.next().charAt(0);
       }
        MyArray mobj = new MyArray();
        
        int iRet = mobj.ArrayCapital(Arr);
        System.out.println("Number of capital letters are "+ iRet);
        
        sobj.close();
    }
}
