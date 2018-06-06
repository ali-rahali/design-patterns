package design.object.creational.factorymethod;

/**
 * Product interface in terminology of factory method pattern
 */
public interface EncryptionAlgorithm {

    /**
     * Encrypts passed plain text using internally implemented encryption algorithm
     */
    String encrypt(String plainText);
}
