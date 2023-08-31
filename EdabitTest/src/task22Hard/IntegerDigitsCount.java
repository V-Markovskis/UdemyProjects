package task22Hard;

public class IntegerDigitsCount {
    public static void main(String[] args) {
        System.out.println(IntegerDigits.count(318));
    }
}

class IntegerDigits {
    public static int count(int n) {
        String value = String.valueOf(n).replaceAll("-","");
        if(value.length() == 1){
            return 1;
        }
        else{
            return 1 + count(Integer.parseInt(value.substring(1)));
        }
    }

    //count(318) -> returns 3
    //1 + count(18) = 2 + 1 = 3
    //1 + count(8) = 1 + 1 = 2
    //count(8) returns 1
}

