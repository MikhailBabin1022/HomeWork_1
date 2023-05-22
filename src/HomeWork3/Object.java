package HomeWork3;

public class Object {
    public UserInputService() {
        this.userInputData = new ArrayList<String>();
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Введите данные: ");
        while (scanner.hasNext()) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            this.userInputData.add(input);
        }

        scanner.close();
    }

    public ArrayList<String> getUserInputData() {
        return this.userInputData;
    }
}
