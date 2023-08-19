////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which displays all elements which are prime from singly 
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

int DisplayPrime(PNODE Head)
{
    int iNo = 0;
    int iCnt = 0;

    while(Head != NULL)
    {
        iNo = Head->Data;

        for(iCnt = 2; iCnt <= iNo/2; iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                break;
            }
        }
        if(iCnt == (iNo / 2)+1)
        {
            printf("%d ",iNo);      //return iNo;
        }
        Head = Head -> next;


    }
}
int main()
{
    PNODE First = NULL; 
    int iRet = 0;

    InsertFirst(&First,89);
    InsertFirst(&First,22);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,20);
    InsertFirst(&First,11);

    Display(First);

    iRet = DisplayPrime(First);

    return 0;
}
