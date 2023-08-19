////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and toggle contents of first 
// and last nibble of the number. Return modified number.(Nibble is a group of four bits).
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>                                  // not complete
using namespace std;

typedef unsigned int UINT;

UINT ToggleBit(UINT iNo)
{
    UINT iMask = 0X10000000;
    UINT iMask1 = 0X00000001;
    UINT iResult1 = 0;
    UINT iResult2 = 0;
   
    iResult1 = iNo & iMask;
    iResult2 = iNo & iMask1;

    return iResult1 | iResult2;

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