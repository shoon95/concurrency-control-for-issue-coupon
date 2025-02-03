package org.example.modulecore.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Quantity {

    private int quantity;

    private Quantity(int quantity) {
        this.quantity = quantity;
    }

    public static Quantity of(int quantity) {
        return new Quantity(quantity);
    }

    public boolean isPositiveQuantity() {
        return quantity > 0;
    }
}
