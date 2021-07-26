package sec6;

class Test5{
    public void m1(int i,float f){
        System.out.println("i+f*3  = "+(i+f*3));
    }
    public void m1(float f,int i){
        System.out.println("f+i*3  = "+(f+i*3));
    }

    public static void main(String[] args) {
        Test5 t5 = new Test5();

        t5.m1(9,9.5f);
        t5.m1(9.67f,7);

        ///t5.m1(10,12)
        /**
         * For m1(int,float):
         *      10 = already in int
         *      12 = promoted to float
         *      So,acceptable for m1(int,float)
         * For m1(float,int):
         *      10 = promoted to float
         *      12 = alreay in int
         *      So,acceptable for m1(float,int)
         * So,here also compiler can not decide which one to execute(ambiguous case)
         *
         **/
        /// Ambiguous case - 2

    }

}