public class Loops {
    public static void main(String[] args) {
        int [] numbers = {2,4,63,341,6,25,6,363,6,22,6};
        for (int number : numbers){

            if (number == 341) continue;
            System.out.println(number);
        }

    }
}
