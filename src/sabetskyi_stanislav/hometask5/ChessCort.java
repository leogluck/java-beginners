package sabetskyi_stanislav.hometask5;

public class ChessCort {
    public static void main(String[] args) {
        String[] corts = new String[2];
        {
            corts[0] = "| W | B | W | B | W | B | W | B |";
            corts[1] = "| B | W | B | W | B | W | B | W |";
        }
        for (int i=0; i<4;i++){
            System.out.println(corts[0]);
            System.out.println(corts[1]);
        }
    }
}
