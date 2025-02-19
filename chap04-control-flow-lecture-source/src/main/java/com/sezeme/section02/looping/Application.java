package com.sezeme.section02.looping;

public class Application {
    public static void main(String[] args) {
        A_for a_for = new A_for();
//        a_for.testSimpleForStatement();
//        a_for.testForExample();
//        a_for.testForExample2();

        B_nestedFor b_nestedFor = new B_nestedFor();
//        b_nestedFor.printGugudanFromTwoToNine();
//        b_nestedFor.printTriangleStar();

        C_while c_while = new C_while();
//        c_while.testSimpleWhileStatement();
//        c_while.testWhileExample();
        c_while.testSimpleDoWhileStatement();
    }
}