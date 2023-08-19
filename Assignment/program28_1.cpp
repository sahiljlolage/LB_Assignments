////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number and position from user and check whether 
// bit at that position is on or off .If bit is one return true otherwise return false.
////////////////////////////////////////////////////////////////////////////////////////////////////
#include<iostream>
using namespace std;

typedef unsigned int UINT;

bool ChkBit(UINT iNo, UINT iPos)
{
    UINT iMask = 0X00000001;
    UINT iResult = 0;

    if((iPos < 1) || (iPos > 32))
    {
        cout<<"Invalid position"<<"\n";
        return false;
    }
    
    iMask = iMask << (iPos - 1 );

    iResult = iNo & iMask;

    if(iResult == iMask)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main()
{
    UINT iValue = 0;
    UINT iBit = 0;
    bool bRet = false;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    cout<<"Enter the position : "<<"\n";
    cin>>iBit;

    bRet = ChkBit(iValue,iBit);

    if(bRet == true)
    {
        cout<<"Result is true"<<"\n";
    }
    else
    {
        cout<<"Result is false"<<"\n";
    }
    
    return 0;
}
