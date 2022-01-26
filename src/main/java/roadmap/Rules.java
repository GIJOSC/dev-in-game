package roadmap;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import enums.*;

public class Rules {
    static Scanner input = new Scanner(System.in);
    static LevelEnum nivel;
    static Player jogador;
    static Random random = new Random();

    public static String getJogador() {
        return jogador.toString();
    }

    public static int rolarDado(int facesDados) {
        return 1 + Rules.random.nextInt(facesDados);
    }

    public static void continuar() {
        System.out.println("Pressione ENTER para continuar...");
        input.nextLine();
    }

    public static void clearConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public static int confirmaEscolha() {
        int confirmacao;
        try {
            confirmacao = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            confirmacao = 2;
            System.out.println("Por favor, digite um número inteiro!");
        }
        return confirmacao;
    }

    public static void lineCombat() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void createGamer() {
        String nome = getNomePersonagem();
        SexEnum tipoSexo = getSexoPersonagem();
        TypeEnum tipoClasse = getClassePersonagem();
        WeaponEnum tipoArma = getTipoArmaPersonagem(tipoClasse);
        LevelEnum tipoNivel = getTipoNivelJogo();

        jogador = new Player(nome, tipoSexo, tipoClasse, tipoArma);
        Rules.nivel = tipoNivel;
        System.out.println(jogador);
        continuar();
    }

    private static LevelEnum getTipoNivelJogo() {
        int confirmacao;
        int nivel;
        LevelEnum tipoNivel = null;
        do {
            System.out.println("Qual a dificuldade do jogo?");
            for (LevelEnum nivelEnum : LevelEnum.values()) {
                System.out.println(nivelEnum.ordinal() + ". " + nivelEnum);
            }
            try {
                nivel = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                nivel = LevelEnum.values().length;
            }
            if (nivel >= LevelEnum.values().length) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                tipoNivel = LevelEnum.values()[nivel];
                System.out.println("A dificuldade do jogo é \"" + tipoNivel + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoNivel;
    }

    public static WeaponEnum getTipoArmaPersonagem(TypeEnum tipoClasse) {
        int confirmacao;
        int arma;
        ArrayList<WeaponEnum> armasClasse = tipoClasse.getTipoArmaEnums();
        WeaponEnum tipoArma = null;
        do {
            System.out.println("Qual a arma do seu personagem?");
            for (WeaponEnum armaEnum : armasClasse) {
                System.out.println(armasClasse.indexOf(armaEnum) + ". " + armaEnum);
            }
            try {
                arma = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                arma = armasClasse.size();
            }
            if (arma >= armasClasse.size()) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                tipoArma = armasClasse.get(arma);
                System.out.println("A arma do seu jogador é \"" + tipoArma + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoArma;
    }

    public static TypeEnum getClassePersonagem() {
        int confirmacao;
        int classe;
        TypeEnum tipoClasse = null;
        do {
            System.out.println("Qual a classe do seu jogador?");
            for (TypeEnum classeEnum : TypeEnum.values()) {
                System.out.println(classeEnum.ordinal() + ". " + classeEnum);
            }
            try {
                classe = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                classe = TypeEnum.values().length;
            }
            if (classe >= TypeEnum.values().length) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                tipoClasse = TypeEnum.values()[classe];
                System.out.println("A classe do seu jogador é \"" + tipoClasse + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        return tipoClasse;
    }

    public static SexEnum getSexoPersonagem() {
        int confirmacao;
        int sexo = 0;
        SexEnum tipoSexo = null;
        do {
            System.out.println("Qual o sexo do seu jogador?");
            for (SexEnum sexoEnum : SexEnum.values()) {
                System.out.println(sexoEnum.ordinal() + ". " + sexoEnum);
            }
            try {
                sexo = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                sexo = SexEnum.values().length;
            }
            if (sexo >= SexEnum.values().length) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                tipoSexo = SexEnum.values()[sexo];
                System.out.println("O sexo do seu jogador é \"" + tipoSexo + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        return tipoSexo;
    }

    public static String getNomePersonagem() {
        int confirmacao;
        String nome;
        do {
            System.out.println("Qual o nome do seu jogador?");
            nome = input.nextLine();
            System.out.println("O nome do seu jogador é \"" + nome + "\"? Aperte 1 para confirmar ou 2 para digitar um novo nome.");
            confirmacao = confirmaEscolha();
        } while (confirmacao != 1);
        return nome;
    }

    public static String getMotivacaoPersonagem() {
        int confirmacao;
        int motivacao;
        MotivationEnum tipoMotivacao = null;
        do {
            System.out.println("Qual a motivação do seu jogador?");
            for (MotivationEnum motivacaoEnum : MotivationEnum.values()) {
                System.out.println(motivacaoEnum.ordinal() + ". " + motivacaoEnum.getMotivacao());
            }
            try {
                motivacao = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                motivacao = MotivationEnum.values().length;
            }
            if (motivacao >= MotivationEnum.values().length) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                tipoMotivacao = MotivationEnum.values()[motivacao];
                System.out.println("A motivação do seu jogador é \"" + tipoMotivacao + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        jogador.setTipoMotivacao(tipoMotivacao);
        lineCombat();
        return tipoMotivacao.getTextoMotivacao();
    }

    public static void atoTresSeguirOuDesistir() {
        int escolha;
        int confirmacao;
        do {
            Rules.lineCombat();
            System.out.println("""
                    O que voce ira fazer?
                    1. DESISTIR
                    2. SEGUIR EM FRENTE""");

            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }

            if (escolha > 2 || escolha < 1) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                String acao = escolha == 1 ? "DESISTIR" : "SEGUIR EM FRENTE";
                System.out.println("Voce ira " + acao + "? Aperte 1 para confirmar sua ação ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 1) {
            Rules.lineCombat();
            System.out.println("""
                               o medo invade o seu coração e você sente que ainda não está à altura do desafio.
                               Você se volta para a noite lá fora e corre em direção à segurança.""");
            System.exit(0);
            return;
        }

        Rules.lineCombat();
        System.out.println("""
                            você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a 
                           frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de 
                           uma porta aberta. """);
    }

    public static void atoTresSaltarAndarOuCorrer() {
        int escolha;
        int confirmacao;
        do {
            System.out.println("""
                    Como voce ira passar pela porta?
                    1. SALTANDO
                    2. ANDANDO
                    3. CORRENDO""");

            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                escolha = 4;
            }

            if (escolha > 3 || escolha < 1) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                System.out.println("Aperte 1 para confirmar sua ação ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);

        if (escolha == 1) {
            Rules.lineCombat();
            System.out.println("""
                     Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.""");
            return;
        }

        if (escolha == 2) {
            Rules.lineCombat();
            System.out.println("""
                    Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você pisa exatamente
                    embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.
                    Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você,
                    no corredor. Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma
                    delas te acerta na perna. """);
            int danoRecebido = Rules.rolarDado(10);
            jogador.diminuirVida(danoRecebido);
            Rules.lineCombat();
            System.out.println("Voce recebeu " + danoRecebido + " de dano!\n" +
                    "Sua vida atual é de " + jogador.getPontosDeVida() + " pontos de vida.");
            return;
        }

        Rules.lineCombat();
        System.out.println("""
               Você respira fundo e desata a correr em direção à sala. Quando passa pela porta, sente que
               pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, olhando
               ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas batendo na pedra
               atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela porta, você entende que
               pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto, mas por sorte você entrou
               correndo e conseguiu escapar desse ataque surpresa.""");
    }

    public static void atoQuatroCombateArmeiro() {
        Battle battle = new Battle(Rules.jogador, new Machine(EnemyEnum.ARMEIRO));
        battle.iniciarCombate();
        System.out.println("""
                           Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados,
                           e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.
                           """);
        int confirmacao;
        int escolha;
        do {
            lineCombat();
            System.out.println("""
                    O que voce desejar fazer?
                    1. USAR ARMADURA DO INIMIGO
                    2. SEGUIR EM FRENTE""");
            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "USAR ARMADURA DO INIMIGO" : "SEGUIR EM FRENTE";
                System.out.println("Voce ira \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        lineCombat();
        if (escolha == 1) {
            System.out.println("""
                    Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, 
                    que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova,
                    você se sente mais protegido para os desafios à sua frente.""");
            int pontosDeArmaduraAntes = jogador.getPontosDeArmadura();
            jogador.setPontosDeArmadura(pontosDeArmaduraAntes + 5);
            int pontosDeArmaduraDepois = jogador.getPontosDeArmadura();
            lineCombat();
            System.out.println("Seus pontos de armadura subiram de " + pontosDeArmaduraAntes + " pontos para " + pontosDeArmaduraDepois + " pontos!");
            lineCombat();
            continuar();
            return;
        }

        System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
        lineCombat();
        continuar();
    }

    public static void atoCincoCombateAlquimista() {
        Battle battle = new Battle(Rules.jogador, new Machine(EnemyEnum.ALQUIMISTA));
        battle.iniciarCombate();
        System.out.println("""
                Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do
                estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo
                um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.""");
        int confirmacao;
        int escolha;
        do {
            lineCombat();
            System.out.println("""
                    O que voce desejar fazer?
                    1. BEBER A POÇÃO
                    2. NÃO BEBER A POÇÃO E SEGUIR EM FRENTE""");
            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "BEBER A POÇÃO" : "NÃO BEBER A POÇÃO E SEGUIR EM FRENTE";
                System.out.println("Voce ira \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1);
        lineCombat();
        if (escolha == 1) {
            System.out.println("""
                    Voce se sente revigorado para seguir adiante!""");
            int pontosDeVidaAntes = jogador.getPontosDeVida();
            int pontosDeVidaClasse = jogador.getClasse().getPontosDeVida();
            jogador.setPontosDeVida(pontosDeVidaClasse);
            lineCombat();
            System.out.println("Seus pontos de vida subiram de " + pontosDeVidaAntes + " pontos para " + pontosDeVidaClasse + " pontos!");
            lineCombat();
            continuar();
            return;
        }

        System.out.println("Voce fica receoso de beber algo produzido pelo inimigo.");
        lineCombat();
        continuar();
    }

    public static void atoSeisCombateLider() {
        int confirmacao;
        int escolha;
        do {
            lineCombat();
            System.out.println("""
                    O que voce desejar fazer?
                    1. ESPERAR
                    2. ATACAR""");
            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                escolha = 3;
            }
            if (escolha > 2) {
                System.out.println("A opção escolhida é invalida");
                confirmacao = 2;
            } else {
                String tipoEscolha = escolha == 1 ? "ESPERAR" : "ATACAR";
                System.out.println("Voce ira \"" + tipoEscolha + "\"? Aperte 1 para confirmar ou qualquer digito para escolher novamente.");
                confirmacao = confirmaEscolha();
            }
        } while (confirmacao != 1 || escolha == 1);

        Battle battle = new Battle(Rules.jogador, new Machine(EnemyEnum.LIDER));
        battle.iniciarCombate();
        continuar();
    }
}
