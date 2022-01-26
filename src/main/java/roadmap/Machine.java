package roadmap;

import enums.EnemyEnum;
import enums.LevelEnum;

public class Machine extends LifePlayer {

    public Machine(EnemyEnum personagem) {
        this.nome = personagem.getNome();
        this.sexo = personagem.getSexo();
        this.pontosDeVida = personagem.getPontosDeVida();
        this.danoArma = personagem.getTipoArmaEnum().getDanoArma();
        this.pontosDeArmadura = personagem.getPontosDeArmadura();
        this.danoAtaque = personagem.getDanoAtaque();
        this.danoTotal = this.danoArma + this.danoAtaque;
    }

    @Override
    public void atacar(Battle battle) {
        double modificadorDano = 1;
        if (Rules.nivel == LevelEnum.FACIL) {
            modificadorDano = 0.8;
        }

        Machine atacante = battle.getInimigo();
        Player defensor = battle.getJogador();

        int rolagemDados = Rules.rolarDado(20);
        if (rolagemDados == 1) {
            System.out.println("O inimigo errou o ataque! Voce não sofreu dano.");
            return;
        }
        String mensagem = null;
        if (rolagemDados == 20) {
            int danoTotal = (int) ((rolagemDados + atacante.danoTotal) * modificadorDano);
            defensor.diminuirVida(danoTotal);
            mensagem = "O inimigo acertou um ataque critico! Voce sofreu "+ danoTotal + " e agora possui " + defensor.getPontosDeVida() + " pontos de vida.";
        }
        if (rolagemDados < 20) {
            danoTotal = (int) ((danoTotal - defensor.getPontosDeArmadura()) * modificadorDano);
            defensor.diminuirVida(danoTotal);
            mensagem = "O inimigo atacou! Voce sofreu "+ danoTotal + " de dano e agora possui " + defensor.getPontosDeVida() + " pontos de vida.";
        }

        if (danoTotal < defensor.getPontosDeArmadura()) {
            System.out.println("O golpe do inimigo não foi o suficiente para passar pela sua armadura!");
            return;
        }

        defensor.diminuirVida(danoTotal);

        if (!defensor.estaVivo()) {
            System.out.println("Voce não estava preparado para a força do inimigo. \n" + defensor.getTipoMotivacao().getMensagemMorte());
            System.exit(0);
        }

        System.out.println(mensagem);
    }
}
