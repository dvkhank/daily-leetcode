package Arrays;


public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int num : nums2) {
            //Function that inserts a value to nums1
            insertSortedArray(num, nums1, m);
            m++;

        }
    }

    private static void insertSortedArray(int value, int[] array, int n) {
        int index = -1 ;
        for (int i = 0; i < n; i++) {
            if (array[i] > value) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            array[n] = value;
        }
        else {
            for(int i = n; i > index; i--) {
                array[i] = array[i-1];
            }
            array[index] = value;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[6]; // Mảng 6 phần tử

        // Thêm 3 giá trị vào mảng tại các vị trí cụ thể
        nums1[0] = 4;
        nums1[1] = 5;
        nums1[2] = 6;
        int [] nums2 = new int[3];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

    }
}



