package task10;

public class PhoneNumFormatting {
    public static void main(String[] args) {
        System.out.println(Program.formatPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(Program.formatPhoneNumber(new int[]{5, 1, 9, 5, 5, 5, 4, 4, 6, 8}));
        System.out.println(Program.formatPhoneNumber(new int[]{3, 4, 5, 5, 0, 1, 2, 5, 2, 7}));
    }
}

class Program {
    public static String formatPhoneNumber(int[] nums) {
        String phoneNum = "";
        for (int i = 0; i < nums.length; i++) {
            if(i == 0) {
                phoneNum += "(";
            } else if (i == 3) {
                phoneNum += ") ";
            } else if (i == 6) {
                phoneNum += "-";
            }
            phoneNum += Integer.toString(nums[i]);
        }
        return phoneNum;
    }
}