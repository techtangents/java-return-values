public class Demo1 {
    public static void main(final String[] args) {
        final String[] ret = new String[2];
        foo(ret, "ohai");
        System.out.println("ret[0] = " + ret[0]);
        System.out.println("ret[1] = " + ret[1]);
    }

    public static void foo(final String[] ret, final String input) {
        ret[0] = "oh";
        ret[1] = "no";
    }
} 