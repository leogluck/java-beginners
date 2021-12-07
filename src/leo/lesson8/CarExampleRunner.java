package leo.lesson8;

public class CarExampleRunner {
    public static void main(String[] args) {
        Cabriolet cabriolet = new Cabriolet();
        Sedan sedan = new Sedan();

        cabriolet.ride();
        sedan.ride();

        System.out.println("Roof in cabriolet is removable: " + cabriolet.isRoofRemovable());
        System.out.println("Roof in sedan is removable: " + sedan.isRoofRemovable());
    }
}
