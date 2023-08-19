////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and count no. of ON(1) bits
// in it without using % and / operator.
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT CountOne(UINT iNo)
{
    UINT iCount = 0;

   while(iNo != 0)
   {
        if(iNo & 1)
        {
            iCount++;      
        }
        iNo = iNo >> 1;
   }    
   return iCount;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    iRet = CountOne(iValue);
    cout<<"Result is : "<<iRet<<"\n";

    return 0;

}