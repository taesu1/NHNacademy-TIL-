public enum HandRank {
    HIGHCARD(0),
    ONEPAIR(1),
    TWOPAIR(2);
    private final int value;

    HandRank(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        return name();
    }

    
    
    
    
}