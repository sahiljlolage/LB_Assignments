/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and on its first
// 4 bits. Return modified number.
/////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>                                                      // complete but why 0XF
using namespace std;

typedef unsigned int UINT;

UINT OnBit(UINT iNo)
{
    UINT iMask = 0XF;
    UINT iResult = 0;

    iResult = iNo | iMask;

    return iResult;
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    iRet = OnBit(iValue);
    cout<<"Result is : "<<iRet<<"\n";

    return 0;  
}