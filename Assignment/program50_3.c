/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : write application which accept file name from user and read all data from that file
// and display that contents on screen. 
/////////////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<stdlib.h>

int main()
{
    int fd = 0;
    char Fname[30];
    int iRet = 0, iSize = 0;
    char *Arr = NULL;

    printf("Enter the file name that you want to open\n");
    scanf("%s",Fname);

    printf("Enter the number of bytes that you want to read : \n");
    scanf("%d",&iSize);

    Arr = (char *)malloc(iSize);

    fd = open(Fname, O_RDWR);

    if(fd == -1)
    {
        printf("Unable to open the file\n");
        return -1;
    }
    
    iRet = read(fd,Arr,iSize);

    printf("%d bytes gets succesfully fetched from the file \n",iRet);

    printf("Data from file is : \n");
    write(1,Arr,iRet);

    close(fd);
    free(Arr);

    return 0;
}   