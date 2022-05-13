package co.com.testing.reto.dto.questions;

import co.com.testing.reto.dto.userinterface.AddDoctorPage;
import co.com.testing.reto.dto.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CreatedDoctor implements Question<Boolean> {

    private String message;


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
//        // boolean nameCourse = SearchCoursePage.NAME_COURSE.resolveFor(actor).getText().equals(Constants.COURSE);
//
//        String code = Text.of(AddDoctorPage.MESSAGE_CREATED).viewedBy(actor).asString();
//        String error = Text.of(AddDoctorPage.MESSAGE_CREATED_ERROR).viewedBy(actor).asString();
//        if (message.equals(code)){
//            result=true;
//
//        }else{
//            result = false;
//
//
//        }
//        System.out.println("el resultado de la question es :"+result);
//        return result;

        boolean correctMessage = AddDoctorPage.MESSAGE_CREATED.resolveFor(actor).getText().equals(Constants.RESPONSE);
        System.out.println(correctMessage);
        return correctMessage;
    }

    public static CreatedDoctor created () {
        return new CreatedDoctor();
    }

}
