package roadmap;

import enums.EnemyEnum;

public class History {

    public static void levelOne() {
        System.out.println("Seja bem vindo(a) à BATALHA FINAL!");
        Rules.createGamer();
        Rules.clearConsole();
    }

    public static void levelTwo() {
        System.out.println(
                """
                        A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do 
                        crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal
                        à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.""");
        Rules.lineCombat();
        System.out.println(
                        """
                       Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos
                       já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e 
                       desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal. """);

        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
        Rules.lineCombat();
        System.out.println(Rules.getMotivacaoPersonagem());
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println(
                """
                Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, 
                suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. 
                Você avança pelo portal. """);
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        Rules.clearConsole();
    }

    public static void levelThree() {
        System.out.println("""
                A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, 
                só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou 
                desistir.""");
        Rules.atoTresSeguirOuDesistir();
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("" +
                "Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre "
                +"como passar pela porta.");
        Rules.lineCombat();
        Rules.atoTresSaltarAndarOuCorrer();
        Rules.lineCombat();
        Rules.continuar();
        Rules.clearConsole();
        System.out.println("""
                Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi 
                aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua 
                frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, 
                mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe 
                que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o 
                que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.clearConsole();
    }

    public static void levelFour() {
        System.out.println("""
                Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com 
                mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara
                com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em 
                armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os 
                equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da 
                região.""");
        Rules.lineCombat();
        Rules.continuar();
        System.out.println("""
                Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, 
                de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque 
                horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        Rules.atoQuatroCombateArmeiro();
        System.out.println("""
                           Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das 
                           fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa 
                           que leva presa ao cinto.""");
        Rules.lineCombat();
        Rules.continuar();
    }

    public static void levelFive() {
        System.out.println("""
                           Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, 
                           tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais
                           força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você 
                           se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem 
                           vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e 
                           você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, 
                           criando poções utilizadas pelos soldados para aterrorizar a região.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("""
                           No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo.
                           Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança 
                           em sua direção.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        Rules.atoCincoCombateAlquimista();
        Rules.lineCombat();
        System.out.println("""
                           Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque
                           do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente 
                           rosado, pega a garrafa e pondera se deve beber um gole.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.clearConsole();
    }

    public static void levelSix() {
        System.out.println("""
                De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras,
                e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente,
                e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza,
                foca no combate que você sabe que irá se seguir, e adentra a porta.""");
        Rules.lineCombat();
        Rules.continuar();
        System.out.println("""
                Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado,
                e prisioneiros acorrentados às paredes.                     
                Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.""");
        Rules.atoSeisCombateLider();
        Rules.lineCombat();
        System.out.println(Rules.jogador.getTipoMotivacao().getMensagemVitoria());
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("""
                           Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, 
                           e todos vocês saem em direção à noite, retornando à cidade. Seu dever está 
                           cumprido.""");
    }
}
