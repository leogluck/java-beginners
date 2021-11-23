package leo.lesson6.constructor;

public class ConstructorExampleRunner {
    public static void main(String[] args) {
        ConstructorExample emptyConstructor = new ConstructorExample();
        ConstructorExample filledUpConstructor = new ConstructorExample(10, 10, 20);

        System.out.println("Volume of figure calculated with empty constructor is: " + emptyConstructor.getVolume());
        System.out.println("Volume of figure calculated with filled up constructor is: " + filledUpConstructor.getVolume());
    }
}
