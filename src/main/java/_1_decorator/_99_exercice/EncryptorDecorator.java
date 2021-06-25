package _1_decorator._99_exercice;

/**
 * Classe réalisant de la compression.
 */
public class EncryptorDecorator extends DateSourceDecorator {

    private Encryptor encryptor = new Encryptor();

    public EncryptorDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        String readed = super.readData();
        return encryptor.encode(readed);
    }

    @Override
    public void writeData(String data) {
        String compressedData = encryptor.decode(data);
        super.writeData(compressedData);
    }
}