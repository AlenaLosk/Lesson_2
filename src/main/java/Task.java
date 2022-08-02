//2) Попробовать вычисления комбинаций типов данных (int и double)
// byte, short, int, long, float, double;
public class Task {

    final static private String MESSAGE_TYPE_RESULT = "have <%s> type result";
    final static private String MESSAGE_TYPE_NUMBER = "<%s> number";

    public String check(double a) {
        return String.format(MESSAGE_TYPE_RESULT, "double");
    }
    public String check(float a) {
        return String.format(MESSAGE_TYPE_RESULT, "float");
    }
    public String check(int a) {
        return String.format(MESSAGE_TYPE_RESULT, "int");
    }

    public String check(long a) {
        return String.format(MESSAGE_TYPE_RESULT, "long");
    }

    public String check(short a) {
        return String.format(MESSAGE_TYPE_RESULT, "short");
    }

    public String check(byte a) {
        return String.format(MESSAGE_TYPE_RESULT, "byte");
    }

    public String type(double a) {
        return String.format(MESSAGE_TYPE_NUMBER, "double");
    }
    public String type(float a) {
        return String.format(MESSAGE_TYPE_NUMBER, "float");
    }
    public String type(int a) {
        return String.format(MESSAGE_TYPE_NUMBER, "int");
    }

    public String type(long a) {
        return String.format(MESSAGE_TYPE_NUMBER, "long");
    }

    public String type(short a) {
        return String.format(MESSAGE_TYPE_NUMBER, "short");
    }

    public String type(byte a) {
        return String.format(MESSAGE_TYPE_NUMBER, "byte");
    }
}
