package sec5;

class Animal{

    String name;
    int height;

    Animal(String name,int height){
        this.name = name;
        this.height = height;
    }
    Animal(){
        this.name = "unknown";
        this.height = -1;
    }
}

class DomestciAnimal extends Animal{
    String color;
    DomestciAnimal(Animal animal,String color){
        super(animal.name, animal.height);
        this.color = color;
    }
    DomestciAnimal(){
        this.color = "unknown";
    }
}

class X{
    int x;
    X(int x){
        this.x = x;
    }
}

class X1 extends X{
    int x;
    X1(X X_){
        super(X_.x);
    }
    X1(X1 X1_,int x){
        super(X1_.x);
        this.x = x;
    }
    int parent_x(){
        return super.x;
    }
    int self_x(){
        return this.x;
    }
    /**
     * x of X1 IS NOT SAME AS x of X
     ***/
}



public class SuperExample02 {
    public static void main(String[] args) {
        X a = new X(45);
        System.out.println(a.x);

        X1 b = new X1(a);
        X1 c = new X1(b,69);

        System.out.println(b.parent_x());
        System.out.println(b.self_x());
        System.out.println(c.parent_x());
        System.out.println(c.self_x());

    }
}
