public class Demo4 {
    public static class Foo {
        private final String toaster;
        private final String muffin;

        private Foo(final String toaster, final String muffin) {
            this.toaster = toaster;
            this.muffin = muffin;
        }

        public static Foo nuFoo(final String toaster, final String muffin) {
            return new Foo(toaster, muffin);
        }

        public String toaster() {
            return toaster;
        }
 
        public String muffin() {
            return muffin;
        }
    }

    public static void main(final String[] args) {
        final Foo ret = foo("ohai");
        System.out.println("ret.toaster = " + ret.toaster());
        System.out.println("ret.muffin = " + ret.muffin());
    }

    public static Foo foo(final String input) {
        return Foo.nuFoo("oh", "yeah");
    }
}