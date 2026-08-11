class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)
        expected_sum = n * (n + 1) // 2
        actual_sum = sum(nums)
        return expected_sum - actual_sum



sol = Solution()
print(sol.missingNumber([0, 3, 1, 4]))


#Desafio: Dentro de um array, encontrar o número que está faltando, sendo os números do array sequencial ao tamanho ex: [0,1,2,3]

#Idea: Utilizar uma expressão matemática que calcula a soma esperada com esse padrão de valores, no final basta somente subtrair do resultado real e obtivemos o resultado





