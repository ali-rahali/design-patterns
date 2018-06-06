package design.object.creational.factorymethod;

/**
 * Concrete creator which specifies what factory method does
 */
public class TeaEncryptor extends Encryptor {

    @Override
    public EncryptionAlgorithm getEncryptionAlgorithm() {
        return new TeaEncryptionAlgorithm();
    }
}
