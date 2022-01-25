package leo.lesson7;

public class RobotHousehold implements IRobotHousehold {
    public static void main(String[] args) {
        IRobotHousehold robot1 = new RobotHousehold();
        RobotHousehold robot2 = new RobotHousehold();

        robot1.goCook("Borsch and Salo");
        robot1.goClean();
        System.out.println(robot1.gimmeCoffee());
        robot1.goSleep(10000000);
//        robot1.playDominoWithMe();

        robot2.goCook("Pizza");
        robot2.goClean();
        System.out.println(robot2.gimmeCoffee());
        robot2.goSleep(15000000);
        robot2.playDominoWithMe();
    }

    @Override
    public void goSleep(long milliseconds) {
        int hours = (int) (milliseconds / 1000 / 60 / 60);
        System.out.println("I will sleep " + hours + " hours");
    }

    @Override
    public void goClean() {
        System.out.println("I'm cleaning");
    }

    @Override
    public void goCook(String dishName) {
        System.out.println("I'll cook you " + dishName + " in half an hour");
    }

    @Override
    public String gimmeCoffee() {
        return "Coffee";
    }

    @Override
    public String gimmeTea() {
        return null;
    }

    public void playDominoWithMe() {
        System.out.println("I'm glad to play domino with you");
    }
}
