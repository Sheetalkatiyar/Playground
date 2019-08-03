#include<stdio.h>

int main()
{
 char s[100];
  int i,word;
  gets(s);
  for(i=0;s[i]!='\0';i++)
  {
    if(s[i]==' ')
    {
      word++;
    }
  }
  word++;
  printf("%d",word);
  return 0;
  
}