////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which display addition of digits of element from singly linear
// linked list.
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

int SumDigit(PNODE Head)
{
    int iSum = 0;
    int iNo = 0;
    int iDigit = 0;


    while(Head != NULL)
    {
        iNo = Head->Data;

        while(iNo != 0 )
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        printf("%d ",iSum);
        iSum = 0;
        Head = Head->next;
    }


}
int main()
{
    PNODE First = NULL; 
    int iRet = 0;

    InsertFirst(&First,640);
    InsertFirst(&First,240);
    InsertFirst(&First,20);
    InsertFirst(&First,230);
    InsertFirst(&First,110);

    Display(First);

    iRet = SumDigit(First);
    // printf("%d",iRet);

    return 0;
}
