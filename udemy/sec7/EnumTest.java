package sec7;

enum PL{

    MNU,MCY,CHE,LIV,ARS;
    /** MNU,MCY,...etc are objects of PL class */
}

enum Players{
    Messi(6),Ronaldo(5),Kaka(1);
    int ballon;

    Players(int ballon){
        this.ballon= ballon;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(PL.CHE);
        PL team1 = PL.valueOf("CHE");
        PL team2 = PL.CHE;
        System.out.println(team1);
        System.out.println(team2);
        PL[] teams = PL.values();
        System.out.println("-------------");
        for(int i = 0;i<teams.length;i++) System.out.println( teams[i] );
        System.out.println("-------------");
        Players p1 = Players.Kaka;
        Players p2 = Players.valueOf("Messi");

        System.out.println(p1.ballon);
        System.out.println(p2.ballon);

        p2.ballon = 7;
        System.out.println(p2.ballon);
        System.out.println(Players.Ronaldo);
        System.out.println(Players.valueOf("Ronaldo"));
        System.out.println(Players.Ronaldo.ballon);


        /// System.out.println(Players.Neymar); (Can not be executed)
        /// System.out.println(Players.valueOf("Robben")); (Can not be executed)


    }
}
