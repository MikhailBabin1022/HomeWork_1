package HomeWork3;

public class Input {
    import java.util.Scanner;

    public class UserInputService {
        private Scanner scanner;

        public UserInputService() {
            this.scanner = new Scanner(System.in);
        }

        public String readLine() {
            return this.scanner.nextLine();
        }

        public int readInt() throws NumberFormatException {
            return Integer.parseInt(this.scanner.nextLine());
        }

        public double readDouble() throws NumberFormatException {
            return Double.parseDouble(this.scanner.nextLine());
        }

        public boolean readBoolean() throws IllegalArgumentException {
            String input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("true")) {
                return true;
            } else if (input.equalsIgnoreCase("false")) {
                return false;
            } else {
                throw new IllegalArgumentException("Input must be 'true' or 'false'");
            }
        }
    }
}
