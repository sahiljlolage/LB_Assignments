/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and toggle 7th bit of that 
// number. Return modified number.
/////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0X00000040;
    UINT iResult = 0;

    iResult = iNo & iMask;

    return (iNo ^ iMask);
}

int main()
{
    UINT iValue = 0;
    UINT iRet = 0;

    cout<<"Enter number : "<<"\n";
    cin>>iValue;

    iRet = ToggleBit(iValue);
    cout<<"Result is : "<<iRet<<"\n";

    return 0;  
}