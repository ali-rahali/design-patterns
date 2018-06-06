package design.object.creational.factorymethod;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * Creator interface in terminology of factory method design pattern
 */
public abstract class Encryptor {

    /**
     * Concrete method which defines part of the inherited logic
     */
    public void writeToFile(String plainText, String fileName) {
        EncryptionAlgorithm encryptionAlgorithm = getEncryptionAlgorithm();
        String encryptedText = encryptionAlgorithm.encrypt(plainText);

        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(encryptedText.getBytes());
        } catch (Throwable t) {
            // some error log message
        }
    }

    /**
     * Method implementation logic of which is deferred to subclasses
     */
    public abstract EncryptionAlgorithm getEncryptionAlgorithm();
}
