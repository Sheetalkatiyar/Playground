#include<stdio.h>
int main()
{
  	int n,i,item1,item2,index1=-1,index2=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&item1,&item2);
  for(i=0;i<n;i++)
  {
    if(item1==a[i] && index1==-1)
    {
      index1=i;
    }
        if(item2==a[i] && index2==-1)
    {
      index2=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",index1,index2);
return 0;
  

    
    
}