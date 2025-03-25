class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
    
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while(p2 >= 0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
//     p1     p      p2
// [1,2,3,0,0,0] [2,5,6]
//     p1   p      p2
// [1,2,3,0,0,6] [2,5,6]
//     p1 p      p1
// [1,2,3,0,5,6] [2,5,6]
//   p1 p        p1
// [1,2,0,3,5,6] [2,5,6]
//               끝
// [1,2,2,3,5,6] [2,5,6]