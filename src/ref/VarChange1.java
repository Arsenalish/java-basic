package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a= 20;
        System.out.println("a = " + a +" 으로 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b=30;
        System.out.println("b = " + b +" 으로 변경");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
