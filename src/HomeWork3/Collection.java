package HomeWork3;

public class Collection {
    import java.util.*;

    public class UserInputData {
        private List<String> data;

        public UserInputData() {
            data = new ArrayList<>();
        }

        public void addData(String inputData) {
            data.add(inputData);
        }

        public List<String> getData() {
            return data;
        }
    }
}
