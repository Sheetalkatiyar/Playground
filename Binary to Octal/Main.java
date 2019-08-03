#include<stdio.h>
#include<math.h>

int main()
{
  int bin,s=0,i=0;
  scanf("%d",&bin);
  while(bin!=0)
  {
    s=s+pow(2,i)*(bin%10);
    bin=bin/10;
    i++;
  }
  int a[50],j=0;
  while(s!=0)
  {
    a[j]=s%8;
    s=s/8;
    j++;
  }
  for(j=j-1;j>=0;j--)
    printf("%d",a[j]);
  return 0;
    
}