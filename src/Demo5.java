public class Demo5 {
    public abstract static class Foo {

        public abstract String toaster();
        public abstract String muffin();

        public static Foo nuFoo(final String toaster, final String muffin) {
            return new Foo() {
                @Override
                public String toaster() {
                    return toaster;
                }

                @Override
                public String muffin() {
                    return muffin;
                }
            };
        }
    }

    public static void callFoo() {
        final Foo ret = foo("ohai");
        System.out.println("ret.toaster = " + ret.toaster());
        System.out.println("ret.muffin = " + ret.muffin());
    }

    public static Foo foo(final String input) {
        return Foo.nuFoo("oh", "yeah");
    }
} 