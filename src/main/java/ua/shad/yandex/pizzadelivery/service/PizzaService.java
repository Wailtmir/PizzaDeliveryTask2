/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.service;

import ua.shad.yandex.pizzadelivery.domain.Pizza;
import java.util.List;

/**
 *
 * @author Alexandr
 */
public interface PizzaService {

    List<Pizza> getAllPizzas();

    public Pizza getPizzaById(Long id);

    public void addPizza(Pizza pizza);
}
