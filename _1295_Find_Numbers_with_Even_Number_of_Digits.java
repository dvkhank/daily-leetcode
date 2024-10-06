public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(countEvenNumber(num) % 2 == 0)
                count++;
        }
        return count;
    }
    public static int countEvenNumber(int n) {
        int count = 0;
        int result;         //Ex: n = 123
        while(n != 0) {         //123           //12        //1
            result = n / 10;    //kq = 12      //kq = 1     //0
            n = result;         // n = 12      //n = 1      //0
            count++;            //count = 1    count = 2    count = 3
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {12,2,33,42,55,61,72,8,9};
        System.out.println(findNumbers(nums));
    }
}


