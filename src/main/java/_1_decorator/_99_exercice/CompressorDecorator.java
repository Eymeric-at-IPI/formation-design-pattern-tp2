package _1_decorator._99_exercice;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * Classe réalisant de la compression.
 */
public class CompressorDecorator extends DateSourceDecorator {

    private Compressor compressor = new Compressor();

    public CompressorDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public String readData() {
        String readed = super.readData();
        return compressor.decompress(readed);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compressor.compress(data);
        super.writeData(compressedData);
    }
}