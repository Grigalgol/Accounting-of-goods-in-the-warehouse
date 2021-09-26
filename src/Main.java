import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Category> categories = new HashMap<>();
        String nameOfCategory;
        Scanner sc = new Scanner(System.in);
        String cmd = "";
        while (!cmd.equals("exit")) {
            cmd = sc.nextLine();
            switch (cmd) {
                case "add category":
                    System.out.println("Enter name of category:");
                    nameOfCategory = sc.nextLine();
                    categories.put(nameOfCategory, new Category(nameOfCategory));
                    System.out.println("Category " + nameOfCategory + " added successfully!");
                    break;
                case "delete category":
                    System.out.println("Enter name of category:");
                    nameOfCategory = sc.nextLine();
                    categories.remove(nameOfCategory);
                    break;
                case "show categories":
                    break;

                    }
            }
        }
    }
}
