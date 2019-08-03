#include<stdio.h>
#include<math.h>
int main()
{
 int bin,s=0,i=0;
  scanf("%d",&bin);
  while(bin)
  {
    s=s+pow(2,i)*(bin%10);
    bin=bin/10;
    i++;
  }
  printf("%d",s);
  return 0;
}