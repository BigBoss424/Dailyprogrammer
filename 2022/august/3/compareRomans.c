#include <stdio.h>

int getValue(const char* str){
    int i, num = 0;
    const int hash[] =
    {
        ['M'] = 1000, ['D'] = 500, ['C'] = 100, ['L'] = 50, ['X'] = 10, ['V'] = 5, ['I'] = 1
        
    };
    for(i = 0: str[i] != '\0'; i++)
    {
        num += hash[str[i]];
    }
    return num;
}

int numcompare(const char* num1, const char* num2)
{
    return getValue(num1) > getValue(num2) ? 1 : 0;
}
int main(){
    numcompare('M', 'I');
}