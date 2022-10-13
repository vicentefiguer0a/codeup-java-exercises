import java.util.Arrays;

public class ServerNameGenerator {

    public static String[] adjs = {"amused", "brainy", "charming", "delightful", "eager", "fierce", "gifted", "happy", "poised", "vivacious"};
    public static String[] nouns = {"animal", "beach", "hydrogen", "jackal", "kangaroo", "caravan", "diamond", "tomato", "night", "energy"};

    public static String randEl(String[] arr) {
        // Method returns random element from passed in array (String).
        int min = 0;
        int max = arr.length - 1;
        int randNum = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return arr[randNum];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", randEl(adjs), randEl(nouns));
    }
}
