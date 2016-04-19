/*
 * JuegoPantallaApp.java
 */

package juegopantalla;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class JuegoPantallaApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override public void startup() {
        show(new JuegoPantallaView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of JuegoPantallaApp
     */
    public static JuegoPantallaApp getApplication() {
        return Application.getInstance(JuegoPantallaApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(JuegoPantallaApp.class, args);
    }
}
