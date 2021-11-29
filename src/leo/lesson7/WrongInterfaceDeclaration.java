package leo.lesson7;

public interface WrongInterfaceDeclaration {
    void out() {
        System.out.println("Interface methods' cannot have body!!!");
    }

    private int getFoo();
}
