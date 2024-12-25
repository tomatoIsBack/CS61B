
public class CS61B {
    public static String university = "UC Berkeley";
    public String semester;
    public CS61BStudent[] students;
    public CS61BStudent[] waitlisteds;
    public CS61B(int capacity, CS61BStudent[] signups, String semester ){
        this.semester = semester;
        this.students = new CS61BStudent[capacity];
        System.arraycopy(signups, 0, this.students, 0, capacity);
        waitlisteds = new CS61BStudent[signups.length - capacity];
        for(int i=0;i<signups.length - capacity; i++){
            waitlisteds[i] = signups[capacity+i];
        }
    }

    public int makeStudentsWatchLecture(){
        int total = 0;
        for(CS61BStudent student: students){
            if(student.watchLecture()){
                total += 1;
            }
        }
        return total;
    }

    public static void changeUniversity(String newuniversity){
        university = newuniversity;
    }

    public void expand(int num){
        int capacity = this.students.length;
        CS61BStudent[] original_students = this.students;
        this.students = new CS61BStudent[capacity + num];
        for(int i=0; i<capacity; i++){
            this.students[i] = original_students[i];
        }
        for(int i=0; i<num; i++){
            this.students[capacity+i] = waitlisteds[i];
        }
    }
}
