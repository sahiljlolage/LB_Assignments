////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and position from user and 
// on that bit. Return modified number.
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT OnBit(UINT iNo,UINT iPos)
{
    UINT iMask = 0X00000001;
    UINT iResult = 0;

    if((iPos < 1) || (iPos > 32))
    {
        cout<<"Invalid position"<<"\n";
        return false;
    }
    
    iMask = iMask << (iPos - 1 );

    iResult = iNo | iMask;

    return iResult;

}

int main()
{
    UINT iValue = 0;
    UINT iBit = 0;
    UINT iRet = 0;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    cout<<"Enter the position : "<<"\n";
    cin>>iBit;

    iRet = OnBit(iValue,iBit);
    cout<<"Result is : "<<iRet<<"\n";

    return 0;

}