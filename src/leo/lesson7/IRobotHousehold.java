package leo.lesson7;

public interface IRobotHousehold {
    void goSleep(long milliseconds);
    void goClean();
    void goCook(String dishName);
    String gimmeCoffee();
    String gimmeTea();
}
