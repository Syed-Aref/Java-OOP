package sec6;
//
class Animal{

}
class Monkey extends Animal{

}

class Test6{
    public void m1(Animal a){

    }
    public void m1(Monkey m){

    }

    public static void main(String[] args) {
        Test6 t6 = new Test6();

        Animal a = new Animal();
        /// Parent reference of Parent object = Acceptable

        Monkey m = new Monkey();
        /// Child reference of Child object = Acceptable

        Animal a1 = new Monkey();
        /// Parent reference of Child object = Acceptable

        ///Monkey m1 =new Animal();
        /// Child reference of Parent object = Not acceptable

        t6.m1(a); // m1(Animal)
        t6.m1(m); // m1(Monkey)
        t6.m1(a1); // m1(Animal)

         /**
         * Because method over-loading is done by compiler based on reference
         * */
        /// Method over-loading is done by compiler based on reference
    }
}
