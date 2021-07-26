package sec5;


class Boo{
    int height , weight;
    String personality;
    Boo(int height,int weight,String personality){
        this.height = height;
        this.weight = weight;
        this.personality = personality;
    }
    Boo(int height,int weight){
        this.height = height;
        this.weight = weight;
        this.personality = "the most evil";
    }

}


class BooType extends Boo{
    String name;
    BooType(int height,int weight,String personality,String name){
        super(height, weight, personality);
        this.name = name;
    }
    BooType(BooType bt){
        super(bt.height,bt.weight,bt.personality);
        this.name = bt.name;
    }
    BooType(int height,int weight,String name){
        super(height,weight);
        this.name = name;
    }
}

public class SuperExample01 {
    public static void main(String[] args) {

    }

}
