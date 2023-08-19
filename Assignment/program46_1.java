////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array from user reverse each number of that 
// array.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void ReverseArray(int arr[])
    {
        int iDigit = 0;
        for(int i = 0; i< arr.length; i++)
        {
            int iRev = 0;
            while(arr[i] != 0)
            {
                iDigit = arr[i] % 10;
                iRev =  iRev * 10 + iDigit;
                arr[i] = arr[i] / 10;
            }
            System.out.println(iRev);
        }
    }

}   
class program46_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int iValue1 = sobj.nextInt();
        
       int Arr[] = new int[iValue1];
       
       System.out.println("Enter Number ");
       for(int i = 0; i< Arr.length; i++)
       {
           Arr[i] = sobj.nextInt();
       }
        MyArray mobj = new MyArray();
        
        mobj.ReverseArray(Arr);
        
        sobj.close();
    }
}
