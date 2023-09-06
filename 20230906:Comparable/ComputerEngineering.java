
public interface ComputerEngineering extends Comparable<ComputerEngineering>{
    
    int getAge();
    String getName();
    @Override
    default int compareTo(ComputerEngineering o) {
        return this.getAge() - o.getAge();
    }

}
    
    
   
    

