class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;//points to the end of nums1
        int p1 = m-1;//points to the valid element in nums1
        int p2 = n-1;//points to the end of nums2

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){//compares elements from nums1 and nums2
                nums1[p] = nums1[p1];//if the above condition is true it places the element at the end of nums1 
                p1--;
                p--;

            }else{
                nums1[p] = nums2[p2];
                p2--;
                p--;
            }

        }
        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
