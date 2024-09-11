package com.floristeria.task;

import com.floristeria.ui.productosAmorUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class productoAmorTask implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(productosAmorUi.BOTONCATEGORIAAMOR ),
                Click.on(productosAmorUi.PRODUCTO_1 ),
                Click.on(productosAmorUi.CARRO_COMPRAS ),
                Click.on(productosAmorUi.BOTONCATEGORIAAMOR ),
                Click.on(productosAmorUi.PRODUCTO_2 ),
                Click.on(productosAmorUi.CARRO_COMPRAS2 )

        );
    }
    public static Performable productosAmor(){
        return instrumented(productoAmorTask.class);
    }
}
