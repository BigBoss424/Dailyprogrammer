# Daily Programmer Challenge
# Date: 8/2/2022
# Author: Aaron Jones
# Description: Assign every lowercase letter a value, from 1 for a to 26 for z. 
#              Given a string of lowercase letters, find the sum of the values of 
#              the letters in the string.
# 
import string

alphabet = string.ascii_lowercase
ltr_list = list(alphabet)

num_list = []
for n in range(1,27):
    num_list.append(n)

master_list = dict(zip(ltr_list, num_list))

def lettersum(letters):
    total = 0
    for ltr in letters:
        total += master_list[ltr]
    return(total)

print(lettersum("")) #0
print(lettersum("a")) #1
print(lettersum("z")) #26
print(lettersum("cab")) #6
print(lettersum("excellent")) #100
print(lettersum("microspectrophotometries")) #317
