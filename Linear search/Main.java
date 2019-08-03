#include<stdio.h>
int main()
{
 int n,i,item;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
   scanf("%d",&arr[i]);
  }
  scanf("%d",&item);
  for(i=0;i<n;i++)
  {
    if(arr[i]==item)
    {
      printf("%d",i+1);
      return 0;
    }
  }
  printf("%d isn't present in the array.",item);
  return 0;
}