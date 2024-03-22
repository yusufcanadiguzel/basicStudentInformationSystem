import java.util.Objects;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int viva;
    double noteRatio;
    double vivaRatio;

    Course(String name, String code, String prefix, double noteRatio, double vivaRatio){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.noteRatio = noteRatio;
        this.vivaRatio = vivaRatio;
        this.note = 0;
        this.viva = 0;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch))
            this.teacher = teacher;
        else
            System.out.println("Eklenmek isteyen öğretmen ile sınıf uyuşmuyor.");
    }

    void printTeacher(){
        System.out.println(this.teacher);
    }
}
