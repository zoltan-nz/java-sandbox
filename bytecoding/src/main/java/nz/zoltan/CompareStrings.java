package nz.zoltan;

public class CompareStrings {
    public static void main(String[] args) {
            String s1 = "Hello World";
            String s2 = f(s1);
            System.out.println(s2.equals(s1));

            String s3 = "Hello";
            String s4 = "World";
            System.out.println(!s3.equals(s4));
    }

    private static String f(String x) {
        return x;
    }
}
