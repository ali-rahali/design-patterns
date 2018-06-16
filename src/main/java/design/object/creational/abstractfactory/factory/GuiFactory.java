package design.object.creational.abstractfactory.factory;

import design.object.creational.abstractfactory.product.Button;
import design.object.creational.abstractfactory.product.Checkbox;
import design.object.creational.abstractfactory.product.Window;

/**
 * Abstract factory interface which groups families of related products
 */
public interface GuiFactory {

    /**
     * Creates button
     */
    Button getButton();

    /**
     * Creates checkbox
     */
    Checkbox getCheckbox();

    /**
     * Creates window
     */
    Window getWindow();
}
