public class Runner2 {
    public static void main(String[] args) {
        //2) Попробовать вычисления комбинаций типов данных (int и double);
        Task task = new Task();
        byte a = 127;
        short b = 20000;
        int c = 1999999;
        long d = 29999999999L;
        float e = 2898655.42F;
        double f = 28768000001.545;

        final String MESSAGE_TEMPLATE = "Operations with %s and %s %s";

        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(a), task.type(b), task.check(a/b)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(a), task.type(c), task.check(a/c)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(a), task.type(d), task.check(a/d)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(a), task.type(e), task.check(a/e)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(a), task.type(f), task.check(a/f)));
        System.out.println();
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(b), task.type(c), task.check(b/c)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(b), task.type(d), task.check(b/d)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(b), task.type(e), task.check(b/e)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(b), task.type(f), task.check(b/f)));
        System.out.println();
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(c), task.type(d), task.check(c/d)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(c), task.type(e), task.check(c/e)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(c), task.type(f), task.check(c/f)));
        System.out.println();
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(d), task.type(e), task.check(d/e)));
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(d), task.type(f), task.check(d/f)));
        System.out.println();
        System.out.println(String.format(MESSAGE_TEMPLATE, task.type(e), task.type(f), task.check(e/f)));
        System.out.println();
    }
}
