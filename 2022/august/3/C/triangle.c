#include <stdlib.h>
#include <stdio.h>

int main()
   {
    char characterName[] = "Hash";
    int characterAge = 35;
    char grade = 'A';
    char phrase[] = "Giraffe Academy";

    printf("There once was a man named %s\n", characterName);
    printf("He was %d years old.\n", characterAge);
    printf("He got a %c \n", grade);

    characterAge = 30;
    printf("He was then %d years old.\n", characterAge);
    printf("My favorite %s is %f", "number", 500.98754);

    int row = 17;
    int pascalTriangle[row][row];
    int x = 1;
    pascalTriangle[1][1] = 1;

    for(int n = 2; n < row; n++)
     {
        x = n;
        while(x<row-1)
         {
            printf(" ");
            x++;
          }
        for(int k = 1; k < row; k++)
             {
            pascalTriangle[n][k] = pascalTriangle[n-1][k-1] + pascalTriangle[n-1][k];
            if(pascalTriangle[n][k] > 0)
             {
                printf("%d", pascalTriangle[n][k]);
            }
        }
        printf("\n");
       }


    return 0;
}


