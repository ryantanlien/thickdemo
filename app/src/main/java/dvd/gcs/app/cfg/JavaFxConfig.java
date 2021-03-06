package dvd.gcs.app.cfg;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * A Spring Configuration class that declares instances JavaFX classes as managed by Spring,
 * allowing Spring to instantiate these classes in it's application context.
 */
@Configuration
public class JavaFxConfig {

    /**
     * Defines a JavaFX button to be managed by Spring.
     * It has a prototype scope thus multiple separate instances of the class can be instantiated.
     *
     * @return a JavaFX Button managed by Spring.
     */
    @Bean
    @Scope("prototype")
    public Button getButton() {
        return new Button();
    }

    /**
     * Defines a JavaFX GridPane to be managed by Spring.
     * It has a prototype scope thus multiple separate instances of the class can be instantiated.
     *
     * @return a JavaFX GridPane managed by Spring.
     */
    @Bean
    @Scope("prototype")
    public GridPane getGridPane() {
        return new GridPane();
    }
}
