package HomeWork3;

public class Get {
    import java.util.Stack;

    public class Main {

        public static Stack<Integer> memory = new Stack<>();

        public static void main(String[] args) {
            // сохранение элементов в память для тестирования
            memory.push(1);
            memory.push(2);
            memory.push(3);

            String userInput = "get";

            if (userInput.equals("get")) {
                Integer oldestElement = null;
                try {
                    oldestElement = memory.peek();
                } catch (Exception e) {
                    // обработка исключения в случае пустого стека
                    e.printStackTrace();
                }
                System.out.println("Самый старый элемент в памяти: " + oldestElement);
            }
        }
    }
}
