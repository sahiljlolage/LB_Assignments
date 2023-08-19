////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which returns largest element from singly 
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

int Minimum(PNODE Head)
{
    int iMin = Head->Data;

    while(Head != NULL)
    {   
        if(Head->Data < iMin)
        {
            iMin = Head->Data;
        }
        Head = Head->next;
    }
    return iMin;
}

int main()
{
    PNODE First = NULL; 
    int iValue  = 0;
    int iRet = 0;

    InsertFirst(&First,640);
    InsertFirst(&First,240);
    InsertFirst(&First,20);
    InsertFirst(&First,230);
    InsertFirst(&First,110);

    Display(First);

    iRet = Minimum(First);
    printf("%d",iRet);

    return 0;

}
