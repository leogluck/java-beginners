package leo.lesson7;

public interface WrongInterfaceDeclaration {
    private void out() {
        System.out.println("Interface methods' cannot have body!!!");
    }

     int getFoo();
}
