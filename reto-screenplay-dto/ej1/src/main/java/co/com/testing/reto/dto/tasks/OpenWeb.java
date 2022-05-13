package co.com.testing.reto.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static co.com.testing.reto.dto.util.Constants.LINK_WEB_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    @Override
    public <T extends Actor> void performAs(T theActor){
        theActor.attemptsTo(Open.url(LINK_WEB_PAGE));
    }
    public static OpenWeb openWebPage(){
        return instrumented(OpenWeb.class);
    }
}
