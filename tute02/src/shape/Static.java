package shape;

public class Static {
    private int nonStaticVariable;

    private static int staticVariable;

    public void nonStaticMethod(Static a) {
        nonStaticVariable = 1;
        staticVariable = 1;

        a.nonStaticVariable = 2;
        a.staticVariable = 2;

        Static.nonStaticVariable = 3;
        Static.staticVariable = 3;
    }

    public static void staticMethod(Static a) {
        nonStaticVariable = 1;
        staticVariable = 1;

        a.nonStaticVariable = 2;
        a.staticVariable = 2;

        Static.nonStaticVariable = 3;
        Static.staticVariable = 3;
    }
}
