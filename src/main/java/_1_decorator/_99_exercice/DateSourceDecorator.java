package _1_decorator._99_exercice;

public abstract class DateSourceDecorator implements DataSource {

    private DataSource dataSource;

    public DateSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        this.dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return this.dataSource.readData();
    }
}
