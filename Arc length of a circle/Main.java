#include<stdio.h>
int main()
{
  float r,angle,length;
  scanf("%f%f",&r,&angle);
  length=2*3.14*r*(angle/360);
  printf("%0.2f",length);
  return 0;
}