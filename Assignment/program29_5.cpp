////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and range of positions from
// user. Toggle all bits from that range.
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT ToggleBitRange(UINT iNo, int iStart, int iEnd)
{
    UINT iMask1 = 0XF0000000;
    UINT iMask2 = 0XF;
    UINT iResult = 0;

    UINT iMask = 0X00000000;

    if((iStart < 1) || (iStart > 32) || 
    (iEnd < 1) || (iEnd > 32))
    {
        cout<<"Invalid position"<<"\n";
        return 0;
    }

    iMask1 = iMask1 >> (iStart - 28);
    iMask2 = iMask2 << (iStart - 28);

    iMask = iNo ^ ( iMask1 ^ iMask2 );


    iResult = iNo & iMask;
    return iResult;
}

int main()
{
    UINT iValue = 0;
    UINT iBit1 = 0;
    UINT iBit2 = 0;
    UINT iRet = 0;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    cout<<"Enter the start position : "<<"\n";
    cin>>iBit1;
    
    cout<<"Enter the end position : "<<"\n";
    cin>>iBit2;

    iRet = ToggleBitRange(iValue,iBit1,iBit2);
    cout<<"Result is : "<<iRet<<"\n";

    return 0;
}