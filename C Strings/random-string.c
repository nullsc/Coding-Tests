/******************************************************************************

*******************************************************************************/
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <string.h>

void randstr(char *buf, int len) //generate a random string
{
  const char characters[] = "abcdefghijklmnopqrstuvwxyz"
                            "0123456789";
  char c;
  
  for (int i = 0; i < len; i++)
    {
      //buf[i] = 'a'; //blank fill
      c = characters[rand() % strlen(characters)];
      buf[i] = c;
    }
  buf[len] = '\0';
}

int main()
{
  srand(time(NULL));

  char str[32];
  randstr(str, 15);
  printf("Random: %s", str);

  return 0;
}
