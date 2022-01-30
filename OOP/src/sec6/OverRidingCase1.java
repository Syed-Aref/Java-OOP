package sec6;

class P1{
    Number m1(int i){
        Number n = new Number() {
            @Override
            public int intValue() {
                return i*90;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };
        return n;
    }

}

class Child1OfP1 extends P1{
    Integer m1(int i){
        return new Integer(i*45);

    }
}

/// Co-variant return type(Since Integer is a child of Number class)
/// How-ever we can not have return type as String for Child1OfP1.m1(int) since
/// String is not child of Number

class Test_1{
    public static void main(String[] args) {
        /// Try here
    }
}