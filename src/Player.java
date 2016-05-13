public class Player {
    private String name;
    private String lastName;
    private String middleName;
    private int age;
    private char type;

    Player(String name, String lastName, String middleName, int age, char type) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return name + " " + lastName;
    }


}
