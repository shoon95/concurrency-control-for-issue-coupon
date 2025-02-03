package org.example.modulecore.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Issuable {

    private boolean issuable;

    private Issuable(boolean issuable) {
        this.issuable = issuable;
    }

    public static Issuable of(boolean issuable) {
        return new Issuable(issuable);
    }
}
