package com.floristeria.question;

import com.floristeria.ui.productosAmorUi;
import com.floristeria.ui.productosCumpleañosUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Validacion2 implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return productosCumpleañosUi.VALIDACION.resolveFor(actor).isVisible();
    }
    public static Question nombre(){
        return new Validacion2();
    }
}
