package HomeWork3;

public class Memory {
    public class MemoryOverflowException extends Exception {
        public MemoryOverflowException() {
            super("Memory overflow: max capacity reached.");
        }
    }
}
