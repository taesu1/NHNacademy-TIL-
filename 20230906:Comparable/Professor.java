
public class Professor implements ComputerEngineering{
    private int labNum;
    private String name;
    private int age;


    public Professor(int labNum, String name, int age){
        this.labNum = labNum;
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
        return labNum + " "+ name + " " + age;
    }
    
}
