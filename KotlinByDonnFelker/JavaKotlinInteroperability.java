package KotlinByDonnFelker;

public class JavaKotlinInteroperability {
    public static void main(String[] args) {

        int sum = KotlinJavaInteroperabilityKt.sum(4, 9);

        // If using @file:JvmName("MyCustomKotlinFilName"), call as below
        //int sum = MyCustomKotlinFilName.sum(4, 9);
        System.out.println("Sum from java is " + sum);
    }

    public static int area(int l, int b) {
        return l * b;
    }
}
