public class Demo2 {
    public static void main(final String[] args) {
        final String[] ret = foo("ohai");
        System.out.println("ret[0] = " + ret[0]);
        System.out.println("ret[1] = " + ret[1]);
    }

    public static String[] foo(final String input) {
        return new String[] {"oh", "alright"};
    }
} 