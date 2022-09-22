//

#include <stdio.h>


int main(){
    float amountInvested;
    int initialCrypto = 1;
    float currentCryptoPrice;
    

    printf("The purpose of this program is to establish how many cryptocurrency\n");
    printf("Please enter the amount of money you want to invest: ");
    scanf("%f", &amountInvested);
    printf("Please enter the Current Crypto Price: ");
    scanf("%f", &currentCryptoPrice);

    float howManyCrypto = amountInvested/currentCryptoPrice;

    printf("You will receive %f in Crypto", howManyCrypto);

    return 0;
}

