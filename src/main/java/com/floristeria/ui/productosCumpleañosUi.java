package com.floristeria.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class productosCumpleañosUi {
    public static final Target BOTON_CATEGORIACUMPLEAÑOS = Target.the("")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/cumpleanos/'])[4]"));

    public static final Target PRODUCTO_1 = Target.the("")
            .located(By.xpath("//a[@title='MDF 0001']"));

    public static final Target CARRO_COMPRAS  = Target.the("")
            .located(By.xpath("//button[@name='add-to-cart']"));

    public static final Target BORRAR = Target.the("")
            .located(By.xpath("(//a[@class='remove'])[3]"));

    public static final Target VALIDACION = Target.the("")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product/mdf-0001/'])[7]"));
}
