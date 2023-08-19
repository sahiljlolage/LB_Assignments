////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept array from user and replace each member 
// with summation of its digit.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void SumArray(int arr[])
    {
        int iDigit = 0;
        for(int i = 0; i< arr.length; i++)
        {
            int iSum = 0;
            while(arr[i] != 0)
            {
                iDigit = arr[i] % 10;
                iSum =  iSum + iDigit;
                arr[i] = arr[i] / 10;
            }
            System.out.println(iSum);
        }
    }

}   
class program46_2
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
        
        mobj.SumArray(Arr);
        
        sobj.close();
    }
}
