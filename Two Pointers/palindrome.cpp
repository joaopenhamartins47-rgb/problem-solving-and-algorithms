
#include <string> 
#include <cctype>
#include <cstring>
#include <iostream> 

using namespace std;

/*
Problema clássico de verificação de palíndromo, a ideia do código é utilizar a técnica two pointers com ponteiros andando das extremidades até o centro, parando exatemente quando já foi realizado todas as verificacoes possiveis, o fato de se ter loops aninhados não o torna O(n²) pois nao repete operações que já foram feitas no loop principal, a verdadeira complexidade desse algoritmo é O(n)

A ideia: pegar uma variavel em cada extremidade da string, verificar enquanto uma não passa a outra, para evitar verificações adicionais desnecessárias, varrer as variáveis até que seja um char válido e se for, verificar se são diferentes, se uma já for diferente, já retorna false, em seguida anda os ponteiros. Ao final se não falhar, retorna true
*/

class Solution {
public:
    bool isPalindrome(string s) 
    {
        int left = 0, right = s.length()-1;
        while(left < right)
        {

            while (left < right && !isalnum(s[left])) 
                left++;
            
                
            
            while (left < right && !isalnum(s[right])) 
                right--;
                
            if (tolower(s[left]) != tolower(s[right])) 
                return false;

            left++;
            right--;
        }

        return true;
    }
};

