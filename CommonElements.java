import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();
        
        String [] firstArray = first.split(" ");
        String [] secondArray = second.split(" ");

        for (String firstIndex : secondArray) {
            for (String secondIndex : firstArray) {
                if (firstIndex.equals(secondIndex)) {
                    System.out.print(firstIndex + " ");
                }
            }
        }
    }
}
