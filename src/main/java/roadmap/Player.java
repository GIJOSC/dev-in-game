package roadmap;

import enums.*;
import lombok.Getter;
import lombok.Setter;

public class Player extends LifePlayer {
    @Setter @Getter
    private MotivationEnum tipoMotivacao;

    public Player(String nome, SexEnum sexo, TypeEnum classe, WeaponEnum arma) {
        this.nome = nome;
        this.sexo = sexo;
        this.pontosDeArmadura = classe.getPontosDeArmadura();
        this.pontosDeVida = classe.getPontosDeVida();
        this.danoAtaque = classe.getDanoAtaque();
        this.nomeArma = arma.getNomeArma();
        this.danoArma = arma.getDanoArma();
        this.classe = classe;
        this.arma = arma;
        this.danoTotal = this.danoArma + this.danoAtaque;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSexo: " + sexo +
                "\nClasse: " + classe +
                "\nPonto de Armadura: " + pontosDeArmadura +
                "\nPonto de Vida: " + pontosDeVida +
                "\nDano de Ataque Classe: " + danoAtaque +
                "\nArma: " + arma +
                "\nNome da Arma: " + nomeArma +
                "\nDano da Arma: " + danoArma +
                "\nDano Total: " + danoTotal ;
    }

    public void fugir () {
        Rules.clearConsole();
        System.out.println("" +
                "Voce não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez.");
        System.exit(0);
    }

    @Override
    public void atacar(Battle battle) {
        double modificadorDano = 1;
        if (Rules.nivel == LevelEnum.DIFICIL) {
            modificadorDano = 0.9;
        }
        Player atacante = battle.getJogador();
        Machine defensor = battle.getInimigo();
        int rolagemDados = Rules.rolarDado(20);
        if (rolagemDados == 1) {
            System.out.println("Voce errou seu ataque! O inimigo não sofreu dano algum.");
            return;
        }

        int danoTotal = (int) ((rolagemDados + atacante.danoTotal) * modificadorDano);
        String mensagem = "Voce acertou um ataque critico! Voce atacou com "+ atacante.getNomeArma() + " e causou " + danoTotal + " de dano ao inimigo!";
        if (rolagemDados < 20) {
            danoTotal = (int) ((danoTotal - defensor.getPontosDeArmadura()) * modificadorDano);
            mensagem = "Voce atacou com "+ atacante.getNomeArma() + " e causou " + danoTotal + " de dano ao inimigo!";
        }


        if (danoTotal < defensor.getPontosDeArmadura()) {
            System.out.println("O seu golpe não foi suficiente para passar pela armadura do inimigo!");
            return;
        }

        defensor.diminuirVida(danoTotal);

        if (!defensor.estaVivo()) {
            mensagem = "O inimigo não foi pareo para o seu heroismo, e jaz imóvel aos seus pés.";
        }

        System.out.println(mensagem);
    }
}
