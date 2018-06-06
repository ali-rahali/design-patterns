package design.object.creational.abstractfactory;

import design.object.creational.abstractfactory.factory.GuiFactory;
import design.object.creational.abstractfactory.product.Button;
import design.object.creational.abstractfactory.product.Checkbox;
import design.object.creational.abstractfactory.product.Window;

/**
 * Desktop is painted according to chosen operating system
 */
public class Desktop {

    private final GuiFactory guiFactory;

    /**
     * It's impossible to create desktop without factory which creates GUI elements
     */
    public Desktop(GuiFactory guiFactory) {
        this.guiFactory = guiFactory;
    }

    /**
     * Some complex stuff is happening here which is decoupled from concrete implementations!
     */
    public void display() {
        Window window = guiFactory.getWindow();
        window.show();

        Checkbox checkbox = guiFactory.getCheckbox();
        checkbox.mark();

        Button button = guiFactory.getButton();
        button.click();
    }
}
