////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and check whether 9th and 
// 12th bit is on or off.
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;
typedef int BOOL;
typedef unsigned int UINT;

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0X900;
    UINT iResult = 0;

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
    bool bRet = false;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    bRet = ChkBit(iValue);
    if(bRet == true)
    {
        cout<<"9th and 12th bits are ON"<<"\n";
    }
    else
    {
        cout<<"9th and 12th bits are ON"<<"\n";
    }

    return 0;
}
