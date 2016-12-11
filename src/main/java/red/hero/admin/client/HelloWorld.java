package red.hero.admin.client;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class HelloWorld extends UI {


    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello World"));
    }
}
