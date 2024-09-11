package com.floristeria.stepDefinitions;

import com.floristeria.question.Validacion;
import com.floristeria.question.Validacion2;
import com.floristeria.task.productoAmorTask;
import com.floristeria.task.productoCumpleañosTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class productosCumpleStep
{
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }






    @Cuando("le da clik en la categoria cumpleaños y el usuario selecione un producto")
    public void leDaClikEnLaCategoriaCumpleañosYElUsuarioSelecioneUnProducto() {
        theActorInTheSpotlight().attemptsTo(
                productoCumpleañosTask.productosCumpleaños()

        );

    }
    @Entonces("se va a ver reflejado en el carro de compras y lo puede eliminar")
    public void seVaAVerReflejadoEnElCarroDeComprasYLoPuedeEliminar() {
        theActorInTheSpotlight().should(
                seeThat(
                        Validacion2.nombre(), Matchers.equalTo(true)
                )

        );

    }
}
