package HomeWork;

public class Intern {
    public class Intern {
        private String name;
        private int age;
        private String major;

        public Intern(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }

        public String getMajor(){
            return this.major;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setMajor(String major){
            this.major = major;
        }

        public void work() {
            System.out.println("I am working as an intern.");
        }
    }
}
