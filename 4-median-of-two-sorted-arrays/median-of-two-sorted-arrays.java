class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // double result=0;
        // int [] res =new int[nums1.length+nums2.length];
        // for(int i=0;i<nums1.length;i++){
        //     res[i]=nums1[i];
        // }
        // for(int i=0;i<nums2.length;i++){
        //     res[nums1.length+i]=nums2[i];
        // }
        //  Arrays.sort(res);
        // if(res.length%2==0){
        //     return result=((double)(res[res.length/2]+res[(res.length/2)-1])/2);
        // }
        // return result=res[res.length/2];


        int m = nums1.length;
        int n = nums2.length;
        int[] res = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {          // < not <=
            if (nums1[i] < nums2[j])
                res[k++] = nums1[i++];
            else
                res[k++] = nums2[j++];
        }
        while (i < m)                     // < not <=
            res[k++] = nums1[i++];
        while (j < n)                     // < not <=
            res[k++] = nums2[j++];

        int len = res.length;
        return len % 2 == 1                          // % not /
            ? (double) res[len / 2]
            : (double) (res[len / 2] + res[len / 2 - 1]) / 2;
    }

    
    
}