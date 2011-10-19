public class Demo3 {
    public static void callFoo() {
        final Pair<String, String> ret = foo("ohai");
        System.out.println("ret.a = " + ret.a);
        System.out.println("ret.b = " + ret.b);
    }

    public static Pair<String, String> foo(final String input) {
        return Pair.p("oh", "yeah");
    }
}
