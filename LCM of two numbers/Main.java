#include<stdio.h>
int main()
{
  int a,b,small,hcf,lcm,i;
  scanf("%d%d",&a,&b);
  small=a>b?b:a;
  for(i=small;i>=0;i--)
  {
    if(a%i==0 && b%i==0)
    {
      hcf=i;
      break;
    }
  }
  lcm=(a*b)/hcf;
  printf("%d",lcm);
  return 0;
}