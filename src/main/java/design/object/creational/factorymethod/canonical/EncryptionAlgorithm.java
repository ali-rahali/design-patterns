package design.object.creational.factorymethod.canonical;

/**
 * Product interface in terminology of factory method pattern
 */
public interface EncryptionAlgorithm {

    /**
     * Encrypts passed plain text using internally implemented encryption algorithm
     */
    String encrypt(String plainText);
}
