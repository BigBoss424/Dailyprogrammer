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

    
    return 0;
}
