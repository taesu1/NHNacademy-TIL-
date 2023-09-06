import java.util.*;

public class Department<E extends ComputerEngineering>   implements Iterable<E> {
    private int departmentNo;
    private String departmentName;
 
    List<E> list = new ArrayList<E>();

    

    public Department(int no , String name){
        this.departmentNo = no;
        this.departmentName = name;
    }
    public int  getStudentNo(){
        return departmentNo;
    }

    public String getName(){
        return departmentName;
    }


    public void sort() {
        Collections.sort(this.list);
    }

    public void sort(Comparator<E> compare){
        Collections.sort(this.list, compare);
    }

    public void add(E e){
        list.add(e);
    }
    public Iterator<E > iterator(){
        return list.iterator();

    }

    public List<E> getList() {
        return list;
    }
   

}