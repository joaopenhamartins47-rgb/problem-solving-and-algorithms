class Solution {
    public int maxArea(int[] heights) {
        int maior = 0;
        int left = 0, right = heights.length - 1;

        while (left < right) {
            int hLeft = heights[left];
            int hRight = heights[right];

            int menor = hLeft < hRight ? hLeft : hRight; 
            int atual = menor * (right - left);
            
            if (atual > maior) {
                maior = atual;
            }

            while (left < right && heights[left] <= menor) {
                left++;
            }
            while (left < right && heights[right] <= menor) {
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