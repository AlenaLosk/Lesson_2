public class Runner1 {
    public static void main(String[] args) {
        //1) Добиться переполнения типа по результату вычислений, посмотреть результаты (вывести в консоль)
        Task task = new Task();
        final String OVERFLOW_MESSAGE = "The overflow result (max %s) for %s is %s";
        final String UNDERFLOW_MESSAGE = "The underflow result (min %s) for %s is %s";
        byte a = Byte.MAX_VALUE;
        a += 1;
        short b = Short.MAX_VALUE;
        b += 1;
        int c = Integer.MAX_VALUE;
        c += 1;
        long d = Long.MAX_VALUE;
        d += 1;
        float e = Float.MAX_VALUE;
        e *= 2;
        double f = Double.MAX_VALUE;
        f *= 2;
        System.out.println(String.format(OVERFLOW_MESSAGE, "+ 1", task.type(a), a));
        System.out.println(String.format(OVERFLOW_MESSAGE, "+ 1", task.type(b), b));
        System.out.println(String.format(OVERFLOW_MESSAGE, "+ 1", task.type(c), c));
        System.out.println(String.format(OVERFLOW_MESSAGE, "+ 1", task.type(d), d));
        System.out.println(String.format(OVERFLOW_MESSAGE, "* 2", task.type(e), e));
        System.out.println(String.format(OVERFLOW_MESSAGE, "* 2", task.type(f), f));
        System.out.println();

        a = Byte.MIN_VALUE;
        a -= 1;
        b = Short.MIN_VALUE;
        b -= 1;
        c = Integer.MIN_VALUE;
        c -= 1;
        d = Long.MIN_VALUE;
        d -= 1;
        e = Float.MIN_VALUE;
        e /= 1000;
        f = Double.MIN_VALUE;
        f /= 1000;
        System.out.println(String.format(UNDERFLOW_MESSAGE, "- 1", task.type(a), a));
        System.out.println(String.format(UNDERFLOW_MESSAGE, "- 1", task.type(b), b));
        System.out.println(String.format(UNDERFLOW_MESSAGE, "- 1", task.type(c), c));
        System.out.println(String.format(UNDERFLOW_MESSAGE, "- 1", task.type(d), d));
        System.out.println(String.format(UNDERFLOW_MESSAGE, "/ 1000", task.type(e), e));
        System.out.println(String.format(UNDERFLOW_MESSAGE, "/ 1000", task.type(f), f));
    }
}
