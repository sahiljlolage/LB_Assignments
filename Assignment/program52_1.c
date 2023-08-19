/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a program which accepts file name from user and count number of capital 
// characters from that file.
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>
#include<string.h>

#define BUFFERSIZE 1024
int CountCapital(char Fname[])
{
    int fd = 0;
    char Arr[BUFFERSIZE];
    int iRet = 0, iCnt = 0, iCount = 0;

    fd = open(Fname,O_RDONLY);

    while(1)
    {
        iRet = read(fd,Arr,sizeof(Arr));
        if(iRet == 0)
        {
            break;
        }
        for(iCnt = 0 ; iCnt < iRet ; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
    }
    return iCount;
}
int main()
{
    char FileName[30];
    int iRet = 0;

    printf("Enter file name ");
    scanf("%s",FileName);

    iRet = CountCapital(FileName);

    printf("Number of capital letters are %d",iRet);

    return 0;
}