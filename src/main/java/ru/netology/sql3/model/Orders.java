package ru.netology.sql3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @ManyToOne
    @JoinColumn(nullable = false, name = "customers_id")
    private Customers customers;

    @Column(name = "product_name")
    private String productName;

    private BigDecimal amount;

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", date=" + date +
                ", customers=" + customers +
                ", productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
