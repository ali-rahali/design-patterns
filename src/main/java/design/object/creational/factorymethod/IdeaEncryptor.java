package design.object.creational.factorymethod;

/**
 * Concrete creator which specifies what factory method does
 */
public class IdeaEncryptor extends Encryptor {

    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new IdeaEncryptionAlgorithm();
    }
}
