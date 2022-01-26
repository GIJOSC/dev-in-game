package enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;

@Getter
public enum TypeEnum {
    GUERREIRO(100, 20, 10, new ArrayList<>(Arrays.asList(WeaponEnum.ESPADA, WeaponEnum.MACHADO))),
    ARMEIRO(100, 15, 10, new ArrayList<>(Arrays.asList(WeaponEnum.FACA, WeaponEnum.ARCO))),
    MAGO(100, 20, 15, new ArrayList<>(Arrays.asList(WeaponEnum.CAJADO, WeaponEnum.LIVRO)));

    private final int pontosDeVida;
    private final int pontosDeArmadura;
    private final int danoAtaque;
    private final ArrayList<WeaponEnum> tipoArmaEnums;

    TypeEnum(int pontosDeVida, int pontosDeArmadura, int danoAtaque, ArrayList<WeaponEnum> tipoArmaEnums) {
        this.pontosDeVida = pontosDeVida;
        this.pontosDeArmadura = pontosDeArmadura;
        this.danoAtaque = danoAtaque;
        this.tipoArmaEnums = tipoArmaEnums;
    }
}
