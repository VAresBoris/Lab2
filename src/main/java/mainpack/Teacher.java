package mainpack;

 public class Teacher extends Person {
    private String degree;
    private String speciality;

     public Teacher(String name, Sex sex, String department, String degree, String speciality) {
         super(name, sex, department, "teacher");
         this.degree = degree;
         this.speciality = speciality;
     }

     public String getDegree() {
         return degree;
     }

     public String getSpeciality() {
         return speciality;
     }

     public void setDegree(String degree) {
        if (degree == null)
            throw new IllegalArgumentException("ученая степень не должна быть пустой ссылкой");
         this.degree = degree;
     }

     public void setSpeciality(String speciality) {
        if (speciality == null)
            throw new IllegalArgumentException("название специальность не дожно быть пустой ссылкой");
         this.speciality = speciality;
     }


     public enum Degree{
        PhD,
        MSc
    }

    public void print(){
        super.print();
        //{He/she} has {degree} degree in {specialty}.
        System.out.println(getSex().getPronoun() + " has " + degree + " in " + speciality + ".");
    }

 }
