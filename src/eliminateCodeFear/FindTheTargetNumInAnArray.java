package eliminateCodeFear;

/**
 * Created by nadimchouglay on 06/10/2018.
 */
public class FindTheTargetNumInAnArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2, 3, 4, 5, 6}, 5));
        System.out.println(search(new int[]{1,7,87,9,4},95));

    }

    public static int search(int[] nums, int target) {
//        for(int i =0;i<nums.length;i++){
//            if (nums[i]==target){
//                return i;
//
//            }
//
//        }return -1;
//    }
//
        int ret = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ret = i;
                break;
            }
        }
        return ret;

    }
}
