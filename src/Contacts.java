import java.util.Scanner;

public class Contacts {


    Scanner scanner = new Scanner(System.in);

    private String name;
    private int number;

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;

    }

    public String printContact(){
        return (this.name + " " + this.number);
   }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
