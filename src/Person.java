import java.util.Scanner;

public class Person {

    private String name;

    public String getName(){
        //TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
        //TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.printf("Hello %s.", this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person user = new Person("Joe");
        System.out.println(user.getName());
        System.out.print("What is your new name? : ");
        String newName = sc.nextLine();
        user.setName(newName);
        System.out.println(user.getName());
        user.sayHello();

    }
}
