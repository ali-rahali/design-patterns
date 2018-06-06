package design.object.creational.abstractfactory.factory;

import design.object.creational.abstractfactory.product.*;

/**
 * Concrete factory implementation related to Linux OS
 */
public class LinuxFactory implements GuiFactory {

    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox getCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public Window getWindow() {
        return new LinuxWindow();
    }
}
