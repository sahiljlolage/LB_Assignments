////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which returns addition of all even elements which are from 
// singly linear linked list.
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

int AdditionEven(PNODE Head)
{
    int iNo = 0;
    int iSum = 0;
    int iCnt = 0;

    while(Head != NULL)
    {

        iNo = Head->Data;

        if(iNo % 2 == 0 )
        {
            iSum = iSum + iNo;
        }
            Head = Head->next;
    }
            return iSum;
}
int main()
{
    PNODE First = NULL; 
    int iRet = 0;

    InsertFirst(&First,41);
    InsertFirst(&First,32);
    InsertFirst(&First,20);
    InsertFirst(&First,11);

    Display(First);

    iRet = AdditionEven(First);
    printf("%d",iRet);

    return 0;
}
