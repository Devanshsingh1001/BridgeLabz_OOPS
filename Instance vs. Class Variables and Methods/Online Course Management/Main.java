public class Main {
    public static void main(String[] args) {
        Course dev = new Course("Btech", 4, 200000);
        dev.courseDetails();;
        

        System.out.println("----------Second Student-----------");
        Course deva = new Course("BCA", 3, 100000);
        deva.courseDetails();;

        Course.instituteDetails("Banaras Hindu University");

        System.out.println("--------Updated dev----------");
        dev.courseDetails();
        System.out.println("--------Updated deva----------");
        deva.courseDetails();
    }
}

class Course{
    String courseName;
    int duration;
    double fee;

    static String instituteName = "G.L.A University";

    Course(String courseName,int duration, double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void courseDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration of the Course : "+duration);
        System.out.println("Fees of the Course : "+fee);
        System.out.println("Name of the institute : "+instituteName);
    }
    static void instituteDetails(String newInstituteName){
        instituteName = newInstituteName;
        System.out.println("Institute name updated to : "+instituteName);
    }
}