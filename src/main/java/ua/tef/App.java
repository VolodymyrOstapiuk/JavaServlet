package ua.tef;

import ua.tef.controller.Controller;
import ua.tef.model.Model;
import ua.tef.view.View;

public class App 
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view,model);
        controller.processConsumer();
    }
}
