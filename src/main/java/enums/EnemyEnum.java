package enums;

import lombok.Getter;

@Getter
public enum EnemyEnum {
    ARMEIRO("ARMEIRO", SexEnum.MASCULINO, 100, 15, 10, WeaponEnum.ESPADA),
    ALQUIMISTA("ALQUIMISTA",SexEnum.MASCULINO, 100, 15, 15, WeaponEnum.CAJADO),
    LIDER("ORQUE",SexEnum.MASCULINO, 100, 20, 15, WeaponEnum.MACHADO);

    private final String nome;
    private final SexEnum sexo;
    private final int pontosDeVida;
    private final int pontosDeArmadura;
    private final int danoAtaque;
    private final WeaponEnum tipoArmaEnum;

    EnemyEnum(String nome, SexEnum sexo, int pontosDeVida, int pontosDeArmadura, int danoAtaque, WeaponEnum tipoArmaEnum) {
        this.nome = nome;
        this.sexo = sexo;
        this.pontosDeVida = pontosDeVida;
        this.pontosDeArmadura = pontosDeArmadura;
        this.danoAtaque = danoAtaque;
        this.tipoArmaEnum = tipoArmaEnum;
    }
}
