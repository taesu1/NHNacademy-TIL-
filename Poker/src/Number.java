    public enum Number {
    TWO(1,"2"),
    THREE(2,"3"),
    FOUR(3,"4"),
    FIVE(4,"5"),
    SIX(5,"6"),
    SEVEN(6,"7"),
    EIGHT(7,"8"),
    NINE(8,"9"),
    TEN(9,"10"),
    J(10,"J"),
    Q(11,"Q"),
    K(12,"K"),
    A(13,"A");
    
    private int value;
    private String name;
    
    public String getName(){
        return name;
    }    

    public int getValue(){
        return value;
    }

    Number(int value , String name){
        this.name = name;
        this.value = value;
    }

    
    
}
