public class Boolean {

    public static void main(String[] args) {
        System.out.println("Truth table p & q  p | q  p ^ q  !p\n");
        System.out.println("  p\t q\tp & q\tp | q\tp ^ q\t!p");
        out(false, false);
        out(true, false);
        out(false, true);
        out(true, true);

    }

    public static void out(boolean p, boolean q) {
        System.out.println((p ? "True\t" : "False\t") + (q ? "True\t " : "False\t")
                + (p & q ? "True\t" : "False\t") + (p | q ? "True\t" : "False\t")
                + (p ^ q ? "True\t" : "False\t") + (!p ? "True\t" : "False\t"));
    }
}