////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which checks whether 5th & 18th bit is On or OFF.
////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;
typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL ChkBit(UINT iNo)
{
    UINT iMask = 0X20010;
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
        cout<<"5th and 18th bit is ON"<<"\n";
    }
    else
    {
        cout<<"5th and 18th bit is OFF"<<"\n";
    }

    return 0;
}

