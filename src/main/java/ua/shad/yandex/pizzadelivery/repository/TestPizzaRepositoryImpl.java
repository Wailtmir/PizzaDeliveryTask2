/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.shad.yandex.pizzadelivery.repository;

import ua.shad.yandex.pizzadelivery.domain.Pizza;
import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alexandr
 */
public class TestPizzaRepositoryImpl implements PizzaRepository {

    public List<Pizza> pizzas;

    public TestPizzaRepositoryImpl() {
        this.pizzas = new LinkedList<Pizza>();

    }

    public List<Pizza> getAllPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> list) {
        for (Pizza pi : list) {
            this.pizzas.add(pi);
        }
    }

}
