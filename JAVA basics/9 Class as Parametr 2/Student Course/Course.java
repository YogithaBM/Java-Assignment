class Course{
    String courseName;
    int duration;
    Trainer trainer;

    Course(String courseName,int duration,Trainer trainer){
        this.courseName=courseName;
        this.duration=duration;
        this.trainer=trainer;
    }
    void displayCourse() {
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration+" months");
        if (trainer != null) {
            trainer.displayTrainer();
        } 
        else {
            System.out.println("Passed value is null,please pass a proper value");
        }
    }
}