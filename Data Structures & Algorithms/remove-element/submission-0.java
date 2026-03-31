class Solution {
    public int removeElement(int[] arr, int val) {
        int i = 0;
        int j = arr.length - 1;
        int count = 0;

        while (i <= j) {

            while (i <= j && arr[i] != val) {
                i++;
            }

            while (i <= j && arr[j] == val) {
                j--;
                count++;  
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
                count++;  
            }
        }

        return arr.length - count;
    }
}
