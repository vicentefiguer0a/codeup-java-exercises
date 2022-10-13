import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class ArrayExercises {

    public static Person[] addPerson(Person[] arr, Person personObj) {
        Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = personObj;
        return newArr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Mike");
        people[2] = new Person("Adam");
        Person vince = new Person("Vince");

        // Using addPerson method.
        Person[] newPersonArr = addPerson(people, vince);
        for (int i = 0; i < newPersonArr.length; i++) {
            System.out.println(newPersonArr[i].getName());
        }
    }
}

// Why is Arrays.toString necessary?
// The .toString method allows for arrays to be printed as shown.
