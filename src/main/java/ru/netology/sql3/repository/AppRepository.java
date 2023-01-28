package ru.netology.sql3.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.sql3.model.Orders;

import java.util.List;

@Repository
public class AppRepository {
    @PersistenceContext
    private EntityManager manager;

    public List<Orders> getProductName(String name) {
        String sql =
                "SELECT O FROM Orders O " +
                        "INNER JOIN Customers C ON O.customers.id = C.id " +
                        "WHERE LOWER(C.name) = LOWER(:name)";

        return manager.createQuery(sql, Orders.class)
                .setParameter("name", name)
                .getResultList();
    }
}
