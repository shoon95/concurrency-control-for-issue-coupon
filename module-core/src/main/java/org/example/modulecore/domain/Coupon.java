package org.example.modulecore.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;

    @Embedded
    private Quantity quantity;
    private Issuable issuable;

    private Coupon(String name, int quantity) {
        this.name = name;
        this.quantity = Quantity.of(quantity);
        this.issuable = Issuable.of(this.quantity.isPositiveQuantity());
    }
}
