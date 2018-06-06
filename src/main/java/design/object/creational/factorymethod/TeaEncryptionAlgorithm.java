package design.object.creational.factorymethod;

/**
 * Concrete product in terms of factory pattern algorithm
 */
public class TeaEncryptionAlgorithm implements EncryptionAlgorithm {

    @Override
    public String encrypt(String plainText) {
        // custom encryption logic
        return plainText;
    }
}
