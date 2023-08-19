////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which search first occurrence  of particular element from singly 
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

int SearchFirstOcc(PNODE Head,int no)
{
    int iCnt = 1;
    while(Head->Data != no)
    {
        iCnt++;
        Head = Head->next;
    }
    return iCnt;

    if(Head->Data == no)
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    PNODE First = NULL; 
    int iValue  = 0;
    int iRet = 0;

    InsertFirst(&First,70);
    InsertFirst(&First,30);
    InsertFirst(&First,50);
    InsertFirst(&First,40);
    InsertFirst(&First,30);
    InsertFirst(&First,20);
    InsertFirst(&First,10);

    Display(First);

    printf("Enter the element : ");
    scanf("%d",&iValue);

    iRet = SearchFirstOcc(First,iValue);
    printf("%d",iRet);

    // Display(First);

    return 0;

}
