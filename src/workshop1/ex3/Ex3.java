package workshop1.ex3;

public class Ex3 extends Electronic implements Gadget {
    public void doSomething() {
        System.out.println("serf internet ...");
    }

    public static void main(String[] args) {
        new Ex3().doSomething();
        new Ex3().getPower();
    }
}
