////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which reverse each element of singly linear linked list.
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

void Reverse(PNODE Head)
{
    int iRev = 0,iRem = 0;

    while(Head != NULL)
    {
        int iNo = Head->Data;
     
        while(iNo > 0)
        {
            iRem = iNo % 10;
            iRev = (iRev * 10) + iRem;
            iNo = iNo / 10;
        }
        printf("%d ",iRev);
        Head = Head->next;
        iRev = 0;
    }
}   

int main()
{
    PNODE First = NULL; 

    InsertFirst(&First,89);
    InsertFirst(&First,6);
    InsertFirst(&First,41);
    InsertFirst(&First,17);
    InsertFirst(&First,28);
    InsertFirst(&First,11);

    Display(First);

    Reverse(First);
    

    return 0;
}
