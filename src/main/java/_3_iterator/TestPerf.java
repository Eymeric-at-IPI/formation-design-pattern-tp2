package _3_iterator;

public class TestPerf {

    public static void main(String[] args) {
        MaLinkedListString list = new MaLinkedListString();
        for (int i = 0; i < 1_000_000; i++) {
            list.add("A");
        }



        long t0 = System.currentTimeMillis();

        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);

    }
}
