package _1_decorator._99_exercice;


public class Demo {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSource dataSource = new FileDataSource("OutputDemo.txt");
        dataSource = new CompressorDecorator(dataSource);
        dataSource = new EncryptorDecorator(dataSource);

        DataSource dataSource2 = new SqlDataSource();
        dataSource2 = new CompressorDecorator(dataSource2);
        dataSource2 = new EncryptorDecorator(dataSource2);
    }
}