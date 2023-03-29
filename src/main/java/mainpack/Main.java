package mainpack;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
              new Teacher("Ronald Turner", Person.Sex.Male, "Computer science",
                      "PhD", "Programming paradigms"),
              new Teacher("Ruth Hollings", Person.Sex.Female, "Jurisprudence",
                      "MSc", "Domestic arbitration"),
              new Student.RegularStudent("Leo Wilkinson", Person.Sex.Male, "Copmuter science",
                      Student.Stage.Bachelor, 3),
              new Student.RegularStudent("Anna Cunningham", Person.Sex.Female, "World economy",
                      Student.Stage.Bachelor, 1),
              new Student.RegularStudent("Jill Lundqvist", Person.Sex.Female, "Jurisprudence",
                      Student.Stage.Master, 1),
              new Student.PhDStudent("Ronald Correa", Person.Sex.Male, "Copmputer science",
                      "Design of a functional programming language.")
        };
        Person.printAll(persons);
    }
}
