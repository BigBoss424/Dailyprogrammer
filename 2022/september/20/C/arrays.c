#include <stdlib.h>
#include <stdio.h>

int main(){
    int luckyNumbers[] = {4, 8, 15, 16, 23, 42};
    char array[] = {'a','b','c'};

    printf("%d", luckyNumbers[0]);
    
    sayHi("Mike");
    sayHi("Oscar");
    sayHi("Tom");

    return 0;
}

void static sayHi(char name[]){
    printf("Hello %s", name);
}