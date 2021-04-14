# reverse-character-array

**Problem Statement**

Given a character array : ['p' 'e' 'r' 'f' 'e' 'c' 't' ' ' 'm' 'a' 'k' 'e' 's' ' ' 'p' 'r' 'a' 'c' 't' 'i' 'c' 'e']

Reverse this array to desired output:

['p' 'r' 'a' 'c' 't' 'i' 'c' 'e' ' ' 'm' 'a' 'k' 'e' 's' ' ' 'p' 'e' 'r' 'f' 'e' 'c' 't']

**Algorithm**

Iterate over given array, and push the characters into stack1, if space character is encountered pop the elements from stack 1 and push it to stack 2.
Once all the characters are iterated, pop elements from stack 2 to return the desired array.

**Time Complexity**

O(n)




