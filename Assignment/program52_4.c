/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a program which accepts file name and one character  from user and count   
// number of occurences of that characters from that file.
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>
#include<string.h>

#define BUFFERSIZE 1024
int CountChar(char Fname[],char Ch)
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
            if(Arr[iCnt] == Ch)
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
    char cValue;

    printf("Enter file name ");
    scanf("%s",FileName);
   
    fflush(stdin);

    printf("Enter the character ");
    scanf("%c",&cValue);

    iRet = CountChar(FileName,cValue);

    printf("Frequency is %d",iRet);

    return 0;
}