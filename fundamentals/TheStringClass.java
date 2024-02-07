public class TheStringClass {
    public static void main(String[] args) {
        String sample = new String("This is a sample string");
        System.out.println(sample);
        System.out.println("uppercase: "+sample.toUpperCase());
        System.out.println("lower case: "+sample.toLowerCase());
        System.out.println("character at: "+sample.charAt(4));
        System.out.println("contains test: "+sample.contains("test"));
    }
}
