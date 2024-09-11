package com.floristeria.stepDefinitions;

import com.floristeria.question.Validacion;
import com.floristeria.task.productoAmorTask;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class productosAmorStepDefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }




    @Dado("que el usuario ingrese a la pagina")
    public void queElUsuarioIngreseALaPagina() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.floristeriamundoflor.com/")
        );
    }

    @Cuando("le da clik en la categoria amor y el usuario selecione dos productos")
    public void leDaClikEnLaCategoriaAmorYElUsuarioSelecioneDosProductos() {
        theActorInTheSpotlight().attemptsTo(
                productoAmorTask.productosAmor()

        );
    }
    @Entonces("se va a ver reflejado en el carro de compras")
    public void seVaAVerReflejadoEnElCarroDeCompras() {
        theActorInTheSpotlight().should(
                seeThat(
                        Validacion.nombre(), Matchers.equalTo(true)
                )

        );

    }
}
