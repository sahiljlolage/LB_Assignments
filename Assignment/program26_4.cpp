////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which checks whether 7th & 8th and 9th bit is On or OFF.
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;
typedef int BOOL;
typedef unsigned int UINT;

#define TRUE 1
#define FALSE 0

BOOL Chkbit(UINT iNo)
{
    UINT iMask = 0X00001C0;
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

    bRet = Chkbit(iValue);
    if(bRet == true)
    {
        cout<<"7th and 8th and 9th bit are ON"<<"\n";
    }
    else
    {
        cout<<"7th and 8th and 9th bit are OFF"<<"\n";
    }

    return 0;

}