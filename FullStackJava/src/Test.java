
class Dummy {
    int var1 = 10;
    final int var2 = 10;
    void method1() {
        var1++;
        System.out.println("Var 1: " + var1);
    }

    void method2() {
        var2++;
        System.out.println("Var 2: " + var2);
    }
}
public class Test {

    public static void main(String[] args) {
        Dummy d = new Dummy();
        d.method1();
        d.method2();
    }
}
