class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int n = arr1.length;
        int m = arr2.length;

        for(int i=0 ; i<m ; i++){
            map.put(arr2[i], i);
        }

        for(int i=0; i<n-1 ; i++){
            for(int j=0 ; j<n-1-i ; j++){

                int a = map.getOrDefault(arr1[j],m);
                int b = map.getOrDefault(arr1[j+1],m);

                if(a>b || (a == b && arr1[j] > arr1[j+1])){
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        return arr1;


    }
}