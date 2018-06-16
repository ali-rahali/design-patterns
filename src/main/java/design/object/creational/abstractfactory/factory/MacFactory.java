package design.object.creational.abstractfactory.factory;

import design.object.creational.abstractfactory.product.*;

/**
 * Concrete factory implementation related to Mac OS
 */
public class MacFactory implements GuiFactory {

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Checkbox getCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public Window getWindow() {
        return new MaxWindow();
    }
}
