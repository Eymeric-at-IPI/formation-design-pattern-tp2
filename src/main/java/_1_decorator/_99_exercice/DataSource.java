package _1_decorator._99_exercice;

/**
 * Interface pour une data source.
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}