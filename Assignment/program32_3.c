/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which display product of all digits of all element from singly
// linear linked list. 
/////////////////////////////////////////////////////////////////////////////////////////////////////////
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

void DisplayProduct(PNODE Head)
{
    int iProd = 1,iRem = 0;

    while(Head != NULL)
    {
        int iNo = Head->Data;
     
        while(iNo != 0)
        {
            iRem = iNo % 10;
            // iProd = iProd * iRem;
            iProd = iProd * ((iRem == 0) ? 1 : iRem);
            iNo = iNo / 10;
        }
        printf("%d ",iProd);
        iProd = 1;
        Head = Head->next;
    }
}   

int main()
{
    PNODE First = NULL; 

    InsertFirst(&First,41);
    InsertFirst(&First,32);
    InsertFirst(&First,20);
    InsertFirst(&First,11);

    Display(First);

    DisplayProduct(First);
    

    return 0;
}
