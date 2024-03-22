public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    int studentNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, int studentNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        average = 0.0;
        isPass = false;
    }

    void addBulkExamNote(int course1Note, int course2Note, int course3Note) {
        if (course1Note >= 0 && course1Note <= 100)
            this.course1.note = course1Note;

        if (course2Note >= 0 && course2Note <= 100)
            this.course2.note = course2Note;

        if (course3Note >= 0 && course3Note <= 100)
            this.course3.note = course3Note;
    }

    void addBulkVivaNote(int vivaNote1, int vivaNote2, int vivaNote3) {
        if (vivaNote1 >= 0 && vivaNote1 <= 100)
            this.course1.viva = vivaNote1;

        if (vivaNote2 >= 0 && vivaNote2 <= 100)
            this.course2.viva = vivaNote2;

        if (vivaNote3 >= 0 && vivaNote3 <= 100)
            this.course3.viva = vivaNote3;
    }

    void calculateAverage(){
        double course1Average = (this.course1.note * this.course1.noteRatio) + (this.course1.viva * this.course1.vivaRatio);
        double course2Average = (this.course2.note * this.course2.noteRatio) + (this.course2.viva * this.course2.vivaRatio);
        double course3Average = (this.course3.note * this.course3.noteRatio) + (this.course3.viva * this.course3.vivaRatio);

        this.average = course1Average + course2Average + course3Average;

        if (average >= 50)
            this.isPass = true;
        else
            this.isPass = false;
    }

    void isPass(){
        if (this.isPass)
            System.out.println("Tebrikler sınıfı geçtiniz.");
        else
            System.out.println("Maalesef sınıfta kaldınız.");
    }

    void printNote(){
        System.out.println(this.course1.name + ": " + this.course1.note);
        System.out.println(this.course2.name + ": " + this.course2.note);
        System.out.println(this.course3.name + ": " + this.course3.note);
    }
}
