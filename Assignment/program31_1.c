////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which displays all elements which are perfect from singly 
// linear linked list.
////////////////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>
#include<stdlib.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

struct Node 
{
    int Data;
    struct Node *next;
};

typedef struct Node NODE;
typedef struct Node *PNODE;
typedef struct Node **PPNODE;

void InsertFirst(PPNODE Head, int no)
{
    PNODE newn = NULL;

    newn =(PNODE)malloc(sizeof(NODE));
    
    newn->next = NULL;
    newn->Data = no;
    
    if(*Head == NULL)
    {
        *Head = newn;
    }
    else
    {
        newn->next = *Head;
        *Head = newn;
    }
}

void Display(PNODE Head)
{
    printf("Elements of linked list are : \n");

    while(Head != NULL)
    {
        printf("| %d | -> ",Head->Data);
        Head = Head->next;
    }
    printf("NULL\n");
}

int DisplayPerfect(PNODE Head)
{
    int iNo = 0;
    int iSum = 0;
    int iCnt = 0;

    while(Head != NULL)
    {
        iNo = Head->Data;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum == iNo)
        {
            printf("%d ",iNo);   //return iNo;
        }
        iSum = 0;
        Head = Head -> next;

    }
}
int main()
{
    PNODE First = NULL; 
    int iRet = 0;

    InsertFirst(&First,89);
    InsertFirst(&First,6);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,28);
    InsertFirst(&First,11);

    Display(First);

    iRet = DisplayPerfect(First);
    // printf("%d",iRet);


    return 0;

}
