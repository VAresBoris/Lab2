package mainpack;

public abstract class Person {
    private String name;
    private Sex sex;
    private String department;
    private final String verb;


    public Person(String name, Sex sex, String department, String verb) {
        this.name = name;
        this.sex = sex;
        this.department = department;
        if (verb == null)
            throw new IllegalArgumentException("глагол не может быть пустой ссылкой");
        this.verb = verb;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("имя не должно быть пустой ссылкой");
        this.name = name;
    }

    public void setSex(Sex sex) {
        if (sex == null)
            throw new IllegalArgumentException("пол не должен быть пустой ссылкой");
        this.sex = sex;
    }

    public void setDepartment(String department) {
        if (department == null)
            throw new IllegalArgumentException("факультет не может быть пустой ссылкой");
        this.department = department;
    }


    public void print() {
        //This is {name}. {He/she} {verb} at {department}.
        System.out.println("This is " + name + "." + " " + sex.getPronoun() + " " + verb +
                " at " + department + ".");

    }

    public enum Sex {
        Male("He", "His"),
        Female("She", "Her");


        private String pronoun;
        private String pronounGen;

        private Sex(String pronoun, String pronounGen) {
            this.pronoun = pronoun;
            this.pronounGen = pronounGen;
        }

        public String getPronoun() {
            return pronoun;
        }

        public String getPronounGen() {
            return pronounGen;
        }
    }

    public static void printAll(Person[] persons) {
        for (Person person : persons) {
            person.print();
            System.out.println();
        }
    }
}
