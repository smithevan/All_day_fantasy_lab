package treasure;

public abstract class Treasure {

    int value;
    String name;

    public Treasure(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getValue(){
        return this.value;
    }

    public String getName() {return this.name;}

}
