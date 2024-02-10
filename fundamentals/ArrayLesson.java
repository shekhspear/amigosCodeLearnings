import java.util.Arrays;

public class ArrayLesson {
    public static void main(String[] args) {
        int [] numbers = new int [4];
        System.out.println(Arrays.toString(numbers));

        boolean [] bool = new boolean[4];
        System.out.println(Arrays.toString(bool));

        String [] strin = new String [4];
        System.out.println(Arrays.toString(strin));


        int [] newNumbers = {02,32,5,353};
        System.out.println(Arrays.toString(newNumbers));

        int [] cloneNumbers;
        cloneNumbers = newNumbers.clone();
        System.out.println(Arrays.toString(cloneNumbers));
    }
}
