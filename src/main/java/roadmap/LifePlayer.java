package roadmap;

import enums.WeaponEnum;
import enums.TypeEnum;
import enums.LevelEnum;
import enums.SexEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
abstract public class LifePlayer {
    protected String nome;
    protected SexEnum sexo;
    protected TypeEnum classe;
    @Setter
    protected int pontosDeVida;
    @Setter
    protected int pontosDeArmadura;
    protected int danoAtaque;
    protected WeaponEnum arma;
    protected String nomeArma;
    protected int danoArma;
    protected int danoTotal;

    public abstract void atacar(Battle battle);

    public void diminuirVida(int danoRecebido) {
        this.pontosDeVida -= danoRecebido;
    }

    public boolean estaVivo() {
        return this.pontosDeVida > 0;
    }
}
