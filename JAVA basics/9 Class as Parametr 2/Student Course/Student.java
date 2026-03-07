class Student{
    String name;
    int age;
    Course course;

    Student(String name,int age,Course course) {
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void displayStudent() {
        System.out.println("Student Name: "+name);
        System.out.println("Age: "+age);
        if (course != null) {
            course.displayCourse();
        } 
        else {
            System.out.println("Passed value is null,please pass a proper value");
        }
    }
}