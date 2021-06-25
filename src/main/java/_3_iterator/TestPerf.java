package _3_iterator;

public class TestPerf {

    public static void main(String[] args) {
        MaLinkedListeString list = new MaLinkedListeString();
        for (int i = 0; i < 1_000_000; i++) {
            list.add("A");
        }



        long t0 = System.currentTimeMillis();

        long t1 = System.currentTimeMillis();
        System.out.println(t1 - t0);

    }
}
