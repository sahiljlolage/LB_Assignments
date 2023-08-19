/////////////////////////////////////////////////////////////////////////////////////////////////////////
//Problem Statement : Write a program which display largest digits of all element from singly
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

void DisplayLarge(PNODE Head)
{
    int iNo = 0;
    int iDigit = 0;
    int iLarge = 0;

    while(Head != NULL)
    {
		int Large = 0, iNo = Head->Data;
        
		while (iNo > 0)
		{
            int iDigit = iNo % 10;
			
            if (Large < iDigit || iNo == Head->Data)
			{
				Large = iDigit;
			}
			iNo = iNo / 10;
		}
		printf("%d ",Large);
		Head = Head->next;
	}    
}   

int main()
{
    PNODE First = NULL; 

    InsertFirst(&First,419);
    InsertFirst(&First,532);
    InsertFirst(&First,250);
    InsertFirst(&First,11);

    Display(First);

    DisplayLarge(First);
    

    return 0;
}
