package mainpack;

public class Student extends Person {

    public Student(String name, Sex sex, String department) {
        super(name, sex, department, "student");
    }

    public enum Stage {
        Bachelor,
        Master
    }

    public static class RegularStudent extends Student {
        private Stage stage;
        private int course;

        public RegularStudent(String name, Sex sex, String department, Stage stage, int course) {
            super(name, sex, department);
            this.stage = stage;
            this.course = course;
        }

        public Stage getStage() {
            return stage;
        }

        public int getCourse() {
            return course;
        }

        public void setStage(Stage stage) {
            if (stage == null)
                throw new IllegalArgumentException("степень обучения не должно быть пустой ссылкой");
            this.stage = stage;
        }

        public void setCourse(int course) {
            if (course < 1 || course > 5)
                throw new IllegalArgumentException("курс должен быть от 1 до 5");
            this.course = course;
        }

        public void print() {
            //{He/she} is {N}‘th year {stage} student.
            System.out.println(getSex().getPronoun() + " is " + course + "'th year " + stage + " student.");
        }
    }

    public static class PhDStudent extends Student {
        private String thesisTitle;

        public PhDStudent(String name, Sex sex, String department, String thesisTitle) {
            super(name, sex, department);
            this.thesisTitle = thesisTitle;
        }

        public String getDissertation() {
            return thesisTitle;
        }

        public void setDissertation(String dissertation) {
            if (dissertation == null)
                throw new IllegalArgumentException("название диссертации не должно быть пустой ссылкой");
            this.thesisTitle = dissertation;
        }

        public void print() {
            // {His/her} thesis title is “{thesis-title}”
            System.out.println(getSex().getPronounGen() + " thesis title is " + thesisTitle + ".");
        }
    }
}
