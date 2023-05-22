package HomeWork3;

public class Service {
    import java.util.ArrayList;
import java.util.Scanner;

    public class CollectionService {

        private ArrayList<String> list = new ArrayList<>();

        public static void main(String[] args) {
            CollectionService service = new CollectionService();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a string: ");
            String input = scanner.nextLine();

            service.addToList(input);
            System.out.println("List: " + service.getList());

            String removed = service.removeFromList();
            System.out.println("Removed item: " + removed);
            System.out.println("List: " + service.getList());
        }

        public void addToList(String item) {
            list.add(item);
        }

        public String removeFromList() {
            if (list.size() > 0) {
                return list.remove(list.size() - 1);
            } else {
                return null;
            }
        }

        public ArrayList<String> getList() {
            return list;
        }
    }
}
