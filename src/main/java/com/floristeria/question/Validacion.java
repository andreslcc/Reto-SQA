package com.floristeria.question;

import com.floristeria.ui.productosAmorUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validacion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return productosAmorUi.VALIDACION.resolveFor(actor).isVisible();
    }
    public static Question nombre(){
        return new Validacion();
    }
}
