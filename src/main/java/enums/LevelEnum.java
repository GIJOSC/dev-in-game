package enums;

import lombok.Getter;

@Getter
public enum LevelEnum {
    FACIL(1),
    MEDIO(2),
    DIFICIL(3);

    private final int nivel;

    LevelEnum(int nivel) {
        this.nivel = nivel;
    }
}
