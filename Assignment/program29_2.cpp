////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which accept one number from user and display position of  
// common ON bits from that two numbers.
////////////////////////////////////////////////////////////////////////////////////////////////////

#include<iostream>
using namespace std;

typedef unsigned int UINT;

void CommonBits(UINT iNo1, UINT iNo2)
{
    int iPos1 = 0;
    int iPos2 = 0;
    int iCnt1 = 0;
    int iCnt2 = 0;

    while((iNo1 && iNo2) != 0)
    {
        if(iNo1 & 1)
        {
             iCnt1++;
        }
        if(iNo2 & 1)
        {
            iCnt2++;
        }

        iNo1 = iNo1 >> 1;
        iPos1++;
        iNo2 = iNo2 >> 1;
        iPos2++;
    }
    cout<<iCnt1<<"\t"<<iCnt2;
}

int main()
{
    UINT iValue1 = 0;
    UINT iValue2 = 0;

    cout<<"Enter first number : "<<"\n";
    cin>>iValue1;
    
    cout<<"Enter second number : "<<"\n";
    cin>>iValue2;

    CommonBits(iValue1,iValue2);

    return 0;

}