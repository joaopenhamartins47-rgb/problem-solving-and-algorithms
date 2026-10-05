class Solution {
    public int maxArea(int[] heights) {
        int maior = 0, wid = 0, atual=0;
        int left = 0, right = heights.length-1, menor = 0;
        while(right > left)
        {
            if(heights[left] < heights[right])
                menor = heights[left];
            else
                menor = heights[right];
            wid = right-left;
            atual = menor*wid;
            if(atual > maior)
                maior = atual;

            if(heights[left] > heights[right])
                right--;
            else if(heights[left] < heights[right])
                left++;
            else
            {
                left++;
                right--;
            }

        }
        return maior;
    }
}

class Mostwater{
    public static void main(String[] args){
        Solution teste = new Solution();
        int[] alturas = {1,7,2,5,4,7,3,6};
        System.out.println(teste.maxArea(alturas));
    }
}