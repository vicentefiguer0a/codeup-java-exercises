import java.util.Scanner;
import java.util.ArrayList;

public class GroceryListApp {

    public static void showGroceryCategories() {
        System.out.println("------------------------------");
        System.out.println("| Select a category:         |");
        System.out.println("| 1. Bread                   |");
        System.out.println("| 2. Dairy                   |");
        System.out.println("| 3. Meats                   |");
        System.out.println("| 4. Fruits                  |");
        System.out.println("| 5. Vegetables              |");
        System.out.println("| 6. Other                   |");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        // Initializing array list for grocery list.
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> groceryList = new ArrayList<>();
        ArrayList<Integer> groceryQuantity = new ArrayList<>();

        // If user wants to create a grocery list, continue with grocery list. Else, prompt message and exit application.
        System.out.println("Would you like to create a grocery list? [y / n]");
        String createList = scanner.nextLine();
        if (createList.equalsIgnoreCase("y") || createList.equalsIgnoreCase("yes")) {
            boolean userContinue = false;
            do {
                System.out.println("Would you like to enter a new item? [y / n]");
                String newItem = scanner.nextLine();
                if (newItem.equalsIgnoreCase("y") || newItem.equalsIgnoreCase("yes")) {
                    userContinue = true;
                    showGroceryCategories();
                    System.out.println("Enter the number of your category of choice: ");
                    int groceryCategory = scanner.nextInt();
                    if (groceryCategory == 1) {
                        System.out.println("Enter the name of bread you would like:");
                        scanner.nextLine();
                        String typeOfBread = scanner.nextLine();
                        groceryList.add(typeOfBread);
                        System.out.println("Enter quantity of desired bread:");
                        int breadAmount = scanner.nextInt();
                        groceryQuantity.add(breadAmount);
                        scanner.nextLine();
                        System.out.println("ADDED TO GROCERY LIST");
                    } else if (groceryCategory == 2) {
                        System.out.println("Enter the name of dairy you would like:");
                        scanner.nextLine();
                        String typeOfDairy = scanner.nextLine();
                        groceryList.add(typeOfDairy);
                        System.out.println("Enter quantity of desired diary:");
                        int diaryAmount = scanner.nextInt();
                        groceryQuantity.add(diaryAmount);
                        scanner.nextLine();
                        System.out.println("ADDED TO GROCERY LIST");
                    } else if (groceryCategory == 3) {
                        System.out.println("Enter the name of meat you would like:");
                        scanner.nextLine();
                        String typeOfMeat = scanner.nextLine();
                        groceryList.add(typeOfMeat);
                        System.out.println("Enter quantity of desired meat:");
                        int meatAmount = scanner.nextInt();
                        groceryQuantity.add(meatAmount);
                        scanner.nextLine();
                        System.out.println("ADDED TO GROCERY LIST");
                    } else if (groceryCategory == 4) {
                        System.out.println("Enter the name of the fruit you would like:");
                        scanner.nextLine();
                        String typeOfFruit = scanner.nextLine();
                        groceryList.add(typeOfFruit);
                        System.out.println("Enter quantity of desired fruit:");
                        int fruitAmount = scanner.nextInt();
                        groceryQuantity.add(fruitAmount);
                        scanner.nextLine();
                        System.out.println("ADDED TO GROCERY LIST");
                    } else if (groceryCategory == 5) {
                        System.out.println("Enter the name of the vegetable you would like:");
                        scanner.nextLine();
                        String typeOfVegetable = scanner.nextLine();
                        groceryList.add(typeOfVegetable);
                        System.out.println("Enter quantity of desired vegetable:");
                        int vegetableAmount = scanner.nextInt();
                        groceryQuantity.add(vegetableAmount);
                        scanner.nextLine();
                        System.out.println("ADDED TO GROCERY LIST");
                    } else if (groceryCategory == 6) {
                        System.out.println("Enter the name of other product you would like:");
                        scanner.nextLine();
                        String typeOfOther = scanner.nextLine();
                        groceryList.add(typeOfOther);
                        System.out.println("Enter quantity of desired product:");
                        int otherAmount = scanner.nextInt();
                        groceryQuantity.add(otherAmount);
                        scanner.nextLine();
                        System.out.println("ADDED TO GROCERY LIST");
                    }
                } else {
                    System.out.println("Finalize order? [y / n]");
                    String finalizeOrder = scanner.nextLine();
                    System.out.println("Here is your grocery list: ");
                    if (finalizeOrder.equalsIgnoreCase("y") || finalizeOrder.equalsIgnoreCase("yes")) {
                        System.out.println("------------------------------------------");
                        for (int i = 0; i < groceryList.size(); i++) {
                            System.out.printf("%s - %d%n", groceryList.get(i), groceryQuantity.get(i));
                            System.out.println("------------------------------------------");
                        }
                    }
                    userContinue = false;
                    System.out.println("Thank you, come again!");
                    System.exit(0);
                }
            } while (userContinue);
        } else {
            System.out.println("Goodbye...");
            System.exit(0);
        }
    }
}
