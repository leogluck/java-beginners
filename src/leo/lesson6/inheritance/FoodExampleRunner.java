package leo.lesson6.inheritance;

public class FoodExampleRunner {
    public static void main(String[] args) {
        Food food = new Food();
        Potato potato = new Potato();
        FriedPotato friedPotato = new FriedPotato();
        BakedPotato bakedPotato = new BakedPotato();

        food.cook();
        potato.cook();
        friedPotato.cook();
        bakedPotato.cook();
    }
}
