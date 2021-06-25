package _1_decorator._99_exercice;

/**
 * Datasource de type fichier. Il pourrait avoir d'autre implémentation : sql, webservice...
 */
public class SqlDataSource implements DataSource {
    public SqlDataSource() {
    }

    @Override
    public void writeData(String data) {
        //TODO
    }

    @Override
    public String readData() {
        //TODO
        return "";
    }
}