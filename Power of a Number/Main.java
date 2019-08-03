#include <stdio.h>
int main()
{
  	int base,exp,p=1,i;
  scanf("%d%d",&base,&exp);
  if(exp>=0)
  {
  for(i=1;i<=exp;i++)
  {
    p=p*base;
  }
    printf("%d",p);
  }
  else
    printf("Wrong input");
    
    return 0;
}