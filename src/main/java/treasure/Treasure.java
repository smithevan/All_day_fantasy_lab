package treasure;

public abstract class Treasure {

    int value;

    public Treasure(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
