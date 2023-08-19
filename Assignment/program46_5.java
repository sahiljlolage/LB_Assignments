////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write java program which accept marks of N students from user and display 
// class of each student.
////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class MyArray
{
    public void Percentage(float arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 35)
            {
                System.out.println(arr[i]+"\tFail");
            }
            else if(arr[i] < 50)
            {
                System.out.println(arr[i]+"\tPass class");
            }
            else if(arr[i] < 60)
            {
                System.out.println(arr[i]+"\tSecond class");
            }
            else if(arr[i] < 70)
            {
                System.out.println(arr[i]+"\tFirst class");
            }
            else
            {
                System.out.println(arr[i]+"\tFirst class with Distinction");
            }
        }
    }

}   
class program46_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter count of students : ");
        int iValue1 = sobj.nextInt();
        
       float Arr[] = new float[iValue1];
       
       System.out.println("Enter students marks : ");
       for(int i = 0; i< Arr.length; i++)
       {
           Arr[i] = sobj.nextFloat();
       }
        MyArray mobj = new MyArray();
        
        mobj.Percentage(Arr);
       
        sobj.close();
    }
}
