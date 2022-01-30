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

enum ABC{
    a(3,1,'h'),b(3,1,'h'),c(3,1,'h'),d(3,1,'h'),t(3,1,'h');
    int n1,m1;
    char char1;


    ABC(int i, int i1, char h) {
        this.n1 = i;
        this.m1 = i1;
        this.char1 = h;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(PL.CHE);  //CHE
        PL team1 = PL.valueOf("CHE");
        PL team2 = PL.CHE;
        System.out.println(team1); //CHE
        System.out.println(team2); //CHE
        PL[] teams = PL.values();
        System.out.println("-------------");
        for(int i = 0;i<teams.length;i++) System.out.println( teams[i] );
        /**
         MNU
         MCY
         CHE
         LIV
         ARS
         **/
        System.out.println("-------------");
        Players p1 = Players.Kaka; //1
        Players p2 = Players.valueOf("Messi"); //6

        System.out.println(p1.ballon);
        System.out.println(p2.ballon);

        p2.ballon = 7;
        System.out.println(p2.ballon); //7
        System.out.println(Players.Ronaldo); //Ronaldo
        System.out.println(Players.valueOf("Ronaldo")); //Ronaldo
        System.out.println(Players.Ronaldo.ballon); //5


        /// System.out.println(Players.Neymar); (Can not be executed)
        /// System.out.println(Players.valueOf("Robben")); (Can not be executed)
        ABC[] abcs = ABC.values();

        System.out.println("-------------");
        for(int i = 0;i<abcs.length;i++) System.out.println( abcs[i] );



    }
}