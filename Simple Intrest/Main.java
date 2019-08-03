#include<stdio.h>
int main()
{
  float p,r,t, s;
  scanf("%f%f%f",&p,&r,&t);
  s=(p*r*t)/100;
  printf("%.6f",s);
  return 0;
}