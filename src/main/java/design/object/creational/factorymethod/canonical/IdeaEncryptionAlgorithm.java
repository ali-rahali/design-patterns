package design.object.creational.factorymethod.canonical;

/**
 * Concrete product in terms of factory pattern algorithm
 */
public class IdeaEncryptionAlgorithm implements EncryptionAlgorithm {

    @Override
    public String encrypt(String plainText) {
        // custom encryption logic
        return plainText;
    }
}
