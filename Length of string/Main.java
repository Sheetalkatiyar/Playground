#include<stdio.h>
int main()
{
  char s[20];
  int i;
 gets(s);
  while(s[i]!='\0')
  {
    i++;
  }
  printf("%d",i);
  
  return 0;
}