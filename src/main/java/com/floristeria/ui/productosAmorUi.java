package com.floristeria.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class productosAmorUi {
    public static final Target BOTONCATEGORIAAMOR = Target.the("Amor")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/amor/'])[4]"));
    public static final Target PRODUCTO_1 = Target.the("")
            .located(By.xpath("//a[@title='MDF 0001']"));


    public static final Target CARRO_COMPRAS = Target.the("")
            .located(By.xpath("//button[@name='add-to-cart']"));


    public static final Target PRODUCTO_2 = Target.the("")
            .located(By.xpath("//a[@title='MDF 00010']"));

    public static final Target CARRO_COMPRAS2 = Target.the("")
            .located(By.xpath("//span[@class='sub-title']"));

    public static final Target VALIDACION = Target.the("")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product/mdf-0001/'])[7]"));


}

