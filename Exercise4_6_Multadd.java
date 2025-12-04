public class Exercise4_6_Multadd {

public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
    }

    public static void main(String[] args) {

        System.out.println(multadd(2, 3, 4)); // test

        double expr1 = multadd(Math.sin(Math.PI/4), 1,
                               Math.cos(Math.PI/4) / 2);

        double expr2 = multadd(Math.log(10), 1, Math.log(20));

        System.out.println(expr1);
        System.out.println(expr2);

        double expsum = expSum(5);
        System.out.println(expsum);
    }
}

}
