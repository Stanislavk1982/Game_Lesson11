import java.util.Scanner;

public class Human extends Player {

    public Human(String name, String lastName) {
        super(name, lastName, "Ivanov");
    }
    public Human(String name, String lastName, String middleName) {
        super(name, lastName, middleName, 25);
    }
    public Human(String name, String lastName, String middleName, int age) {
        super(name, lastName, middleName, age, 'X');
    }


    @Override
    public String makeMove() {
        Scanner scanner=new Scanner(System.in);
        String move = scanner.next();
        return move;
    }

}
