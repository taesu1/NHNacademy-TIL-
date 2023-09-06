public class Student implements ComputerEngineering {
    private int studentNo;
    private String name;
    private int age;
    

    @Override
    public String getName() {
        return name;
    }


    public Student(int studentNo, String name, int age) {
        this.studentNo = studentNo;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


    @Override
    public String toString() {
        return studentNo + " " + name + " " + age;
    }



    


}