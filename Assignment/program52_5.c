/////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write a program which accepts file name and one count from user and read that        
// number of characters from starting position.
/////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>
#include<string.h>

#define BUFFERSIZE 1024
void DisplayN(char Fname[],int iSize)
{
    int fd = 0;
    char Arr[BUFFERSIZE];
    int iRet = 0, iCnt = 0, iCount = 0;

    fd = open(Fname,O_RDONLY);

    iRet = read(fd,Arr,sizeof(iSize));

    printf("Data from file is : \n");
    write(1,Arr,iRet);

    close(fd);

}
int main()
{
    char FileName[30];
    int iValue = 0;;

    printf("Enter file name ");
    scanf("%s",FileName);
   
    fflush(stdin);

    printf("Enter the number of characters ");
    scanf("%c",&iValue);

    DisplayN(FileName,iValue);

    return 0;
}
