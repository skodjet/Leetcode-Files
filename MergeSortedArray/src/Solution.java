public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; //Pointer for nums1
        int j = n - 1; //Pointer for nums2

        for(int k = (m + n) - 1; k >= 0; k--) {
            if(i < 0) { //nums1 is empty so take from nums2 and decrement j
                nums1[k] = nums2[j];
                j--;
            }
            else if(j < 0) { //nums2 is empty so take from nums1 and decrement i
                nums1[k] = nums1[i];
                i--;
            }

            else if(nums1[i] >= nums2[j]) { //Take from nums1 and decrement i
                nums1[k] = nums1[i];
                i--;
            } else if(nums1[i] < nums2[j]) { //Take from nums2 and decrement j
                nums1[k] = nums2[j];
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};

        test.merge(nums1,3,nums2,3);


    }
}
