class StudentApp{

    public static void main(String[] args){

        Trainer trainer=new Trainer("Arjun", "Backend Development");

        Course course=new Course("Java Programming",433,trainer);

        Student student=new Student("Ravi",319,course);

        student.displayStudent();
    }
}