////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a java program which accept N numbers from user and display all such elements 
// which are divisible by 5. 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.*;

class ArrayDemo
{
    public int Arr[];

    public ArrayDemo(int iSize)
    {
        Arr = new int[iSize];
    }

    public int[] Accept()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the elements : ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        sobj.close();
        return Arr;
    }
    public void Display(int arr[])
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt] % 5 == 0)
            {
                System.out.print(arr[iCnt]+"\t");
            }
        }
    }
}

class program34_2
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        ArrayDemo mobj = new ArrayDemo(iSize);

        int[] arr = mobj.Accept();

        mobj.Display(arr);

        sobj.close();
    }
}





























// class ArrayDemo
// {
//     protected int Arr[];

//     public ArrayDemo(int iSize)
//     {
//         Arr = new int[iSize];
//     }

//     protected void Accept()
//     {
//         Scanner sobj = new Scanner(System.in);

//         System.out.println("Enter the elements : ");
//         for(int iCnt = 0; iCnt < Arr.length; iCnt++)
//         {
//             Arr[iCnt] = sobj.nextInt();
//         }

//         sobj.close();
//     }
// }

// class MyArray extends ArrayDemo
// {
//     public MyArray(int iSize)
//     {
//         super(iSize);
//     }
    
//     public void Display(int Arr[])
//     {
//         int iCnt = 0;
//         for(iCnt = 0; iCnt < Arr.length; iCnt++)
//         {
//             if(Arr[iCnt] % 5 == 0)
//             {
//                 System.out.print(Arr[iCnt]+"\t");
//             }
//         }
//         // return new int(Arr);
//     }
// }
// class program34_2
// {
//     public static void main(String Arg[])
//     {
//         Scanner sobj = new Scanner(System.in);

//         System.out.println("Enter number of elements : ");
//         int iSize = sobj.nextInt();

//         int[] array = new int[iSize];

//         MyArray mobj = new MyArray(iSize);
//         mobj.Accept();

//         mobj.Display(array);

//         sobj.close();
//     }
// }