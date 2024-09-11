package com.floristeria.task;

import com.floristeria.ui.productosAmorUi;
import com.floristeria.ui.productosCumpleañosUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class productoCumpleañosTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(productosCumpleañosUi.BOTON_CATEGORIACUMPLEAÑOS ),
                Click.on(productosCumpleañosUi.PRODUCTO_1 ),
                Click.on(productosCumpleañosUi.CARRO_COMPRAS ),
                Click.on(productosCumpleañosUi.BORRAR )



        );

    }
    public static Performable productosCumpleaños(){
        return instrumented(productoCumpleañosTask.class);
    }
}
