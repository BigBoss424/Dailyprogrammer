#include <stdlib.h>
#include <stdio.h>

int main()
{
    char characterName[] = "Tom";
    int characterAge = 35;
    char grade = 'A';
    char phrase[] = "Giraffe Academy";

    printf("There once was a man named %s\n", characterName);
    printf("He was %d years old.\n", characterAge);
    
    characterAge = 30;
    printf("He was then %d years old.\n", characterAge);
    printf("My favorite %s is %f", "number", 500.98754);

    printf("Here is Pascal's Triangle");
    int n;
    printf("Enter the amount of rows: %s", n);

    for(int i = 0; i <= n; i++){
        for(int j = 0; j<= n-i; j++){
            printf(" ");
        }
        for(int j = 0; j <= i; j++){
            printf("%2d", ncr(i, j));
        }
        printf("\n");
    }
    
    return 0;
}

int pascalsTriangle(int n){
    int f; 

    for(f = 1; n > 1; n--)
    {
        f *= n;
    }

    return f;
}

int ncr(int n, int r){
    return factorial(n) / (factorial(n-r) * factorial(r));

}

