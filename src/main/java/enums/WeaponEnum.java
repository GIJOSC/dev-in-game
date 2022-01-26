package enums;

import lombok.Getter;

@Getter
public enum WeaponEnum {
    MACHADO("machado", 20),
    ESPADA("espada", 15),
    FACA("faca", 15),
    ARCO("arco", 20),
    LIVRO("livro", 10),
    CAJADO("cajado", 15);

    private final String nomeArma;
    private final int danoArma;

    WeaponEnum(String nomeArma, int danoArma) {
        this.nomeArma = nomeArma;
        this.danoArma = danoArma;
    }
}
