#include<stdio.h>
int main()
{
  char s1[100],s2[100],s3[100];
  int i;
  scanf("%s%s%s",s1,s2,s3);
  for(i=0;s1[i]!='\0';i++)
  {
    if(s1[i]=='a'||s1[i]=='e'||s1[i]=='i'||s1[i]=='o'||s1[i]=='u'||s1[i]=='A'||s1[i]=='E'||s1[i]=='I'||s1[i]=='O'||s1[i]=='U')
    {
      s1[i]='$';
  }
  }
  for(i=0;s2[i]!='\0';i++)
  {
    if(!(s2[i]=='a'||s2[i]=='e'||s2[i]=='i'||s2[i]=='o'||s2[i]=='u'||s2[i]=='A'||s1[i]=='E'||s2[i]=='I'||s2[i]=='O'||s2[i]=='U'))
    {
      s2[i]='#';
    }
  }
  for(i=0;s3[i]!='\0';i++)
  {
    if(s3[i]>='a' && s3[i]<='z')
    {
      s3[i]=s3[i]-32;
    }
  }
  int l;
  for(l=0;s1[l]!='\0';l++);
  for(i=0;s2[i]!='\0';i++)
  {
    s1[l++]=s2[i];
  }
  for(i=0;s3[i]!='\0';i++)
  {
    s1[l++]=s3[i];
  }
  s1[l]='\0';
  printf("%s",s1);
  return 0;
    
    
}