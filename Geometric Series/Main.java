#include<stdio.h>
#include<math.h>
int main()
{
  int  n,a,r,t1,t2,odd,even;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=1,r=2;
    t1=(n+1)/2;
    odd=a*pow(r,((n+1)/2)-1);
    printf("%d",odd);
  }
  else
  {
    a=1,r=3;
  t2=n/2;
  even=a*pow(r,(n/2)-1);
  printf("%d",even);
  }
  
  return 0;
}