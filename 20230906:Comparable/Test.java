import java.util.*;

public class Test {

    public static void main(String[] args) {
        Department<ComputerEngineering> department = new Department<>(1, "computer Engineering");
        department.add(new Student(1, "Celine", 21));
        department.add(new Student(2, "James", 23));
        department.add(new Student(5, "Adam", 26));
        department.add(new Student(3, "Jason", 19));
        department.add(new Professor(251, "Jang", 54));
        department.add(new Professor(262, "Park", 63));
        department.add(new Professor(167, "Yoon", 49));
        department.add(new Professor(723, "Jung", 58));

        // 나이순 기본 정렬
        System.out.println("나이순 정렬");
        Collections.sort(department.getList());
        printComputerEngineering(department);
        System.out.println("________________");
        // 나이 역순
        System.out.println("나이 역순 정렬");
        Collections.sort(department.getList(), (a , y) -> y.getAge() - a.getAge());
        printComputerEngineering(department);
    }

    public static void printComputerEngineering(Department<ComputerEngineering> department) {

        Iterator<ComputerEngineering> it = department.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
