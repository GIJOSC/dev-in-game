package roadmap;

import enums.LevelEnum;
import lombok.Getter;

@Getter
public class Battle {
    public Player jogador;
    public Machine inimigo;

    public Battle(Player jogador, Machine inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public void acoesJogadorCombate() {
        Rules.lineCombat();

        int escolha;
        int confirmacao;
        do {
            System.out.println("""
                    O que voce deseja fazer?
                    1. ATACAR
                    2. FUGIR""");
            try {
                escolha = Integer.parseInt(Rules.input.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }

            if (escolha > 2 || escolha < 1) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                String acao = escolha == 1 ? "ATACAR" : "FUGIR";
                System.out.println("Voce ira " + acao + "? Aperte 1 para confirmar sua ação ou qualquer digito para escolher novamente.");
                confirmacao = Rules.confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 2) {
            Rules.lineCombat();
            jogador.fugir();
            return;
        }

        Rules.lineCombat();
        jogador.atacar(this);
        Rules.lineCombat();
    }

    public void iniciarCombate() {
        boolean jogadorComecaPrimeiro = jogadorComecaPrimeiro();
        do {
            if (jogadorComecaPrimeiro) {
                acoesJogadorCombate();
                inimigo.atacar(this);
            } else {
                inimigo.atacar(this);
                acoesJogadorCombate();
            }
        } while (inimigo.estaVivo());
    }

    public boolean jogadorComecaPrimeiro() {
        int iniciativaJogador = Rules.rolarDado(20);
        int iniciativaInimigo = Rules.rolarDado(20);

        return iniciativaJogador > iniciativaInimigo;
    }
}
