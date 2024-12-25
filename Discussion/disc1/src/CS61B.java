
public class CS61B {
    public static String university = "UC Berkeley";
    public String semester;
    public CS61BStudent[] students;
    public int max;
    public CS61B(int max, CS61BStudent[] students, String semester ){
        this.semester = semester;
        this.students = students;
        this.max = max;
        //this.students = new CS61BStudent[max];
        //System.arraycopy(students, 0, this.students, 0, max);
    }

    public int makeStudentsWatchLecture(){
        int nums = 0;
        for (int i=0; i<max; i++){
            if (students[i].watchLecture())
                nums += 1;
        }
        //for(CS61BStudent student: students){
        //    if (student.watchLecture())
        //        nums += 1;
        //}
        return nums;
    }

    public static void changeUniversity(String university){
        university = university;
    }

    public void expand(int num){
        this.max = num+max;
    }
}
