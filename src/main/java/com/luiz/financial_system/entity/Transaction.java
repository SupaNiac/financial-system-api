package com.luiz.financial_system.entity;

import com.luiz.financial_system.enums.TransactionType;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private LocalDate date;

}
