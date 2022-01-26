package roadmap;

import enums.EnemyEnum;

public class History {

    public static void levelOne() {
        System.out.println("Seja bem vindo(a) � BATALHA FINAL!");
        Rules.createGamer();
        Rules.clearConsole();
    }

    public static void levelTwo() {
        System.out.println(
                """
                        A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do 
                        crep�sculo voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal
                        � sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.""");
        Rules.lineCombat();
        System.out.println(
                        """
                       Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os inimigos
                       j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu equipamento de combate, j� danificado e 
                       desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal. """);

        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("Buscando uma inje��o de �nimo, voc� se for�a a lembrar o que te trouxe at� aqui.");
        Rules.lineCombat();
        System.out.println(Rules.getMotivacaoPersonagem());
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println(
                """
                Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, 
                suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. 
                Voc� avan�a pelo portal. """);
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        Rules.clearConsole();
    }

    public static void levelThree() {
        System.out.println("""
                A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, 
                s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou 
                desistir.""");
        Rules.atoTresSeguirOuDesistir();
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("" +
                "Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre "
                +"como passar pela porta.");
        Rules.lineCombat();
        Rules.atoTresSaltarAndarOuCorrer();
        Rules.lineCombat();
        Rules.continuar();
        Rules.clearConsole();
        System.out.println("""
                Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi 
                aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A porta � sua 
                frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, 
                mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima da porta e percebe 
                que ela est� trancada por duas fechaduras douradas, e voc� entende que precisar� primeiro derrotar o 
                que estiver nas outras duas portas laterais, antes de conseguir enfrentar o l�der.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.clearConsole();
    }

    public static void levelFour() {
        System.out.println("""
                Voc� se aproxima, tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com 
                mais for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� se depara
                com uma sala espa�osa, com v�rios equipamentos de batalha pendurados nas paredes e dispostos em 
                arm�rios e mesas. Voc� imagina que este seja o arsenal do inimigo, onde est�o guardados os 
                equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da 
                regi�o.""");
        Rules.lineCombat();
        Rules.continuar();
        System.out.println("""
                Enquanto seu olhar percorre a sala, voc� ouve a porta se fechando e gira rapidamente para olhar para tr�s. Ali, 
                de p� entre voc� e a porta fechada, bloqueando o caminho do seu destino, est� um dos capit�es do inimigo. Um orque 
                horrendo, de armadura, capacete e espada em punho, em posi��o de combate. Ele avan�a em sua dire��o.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        Rules.atoQuatroCombateArmeiro();
        System.out.println("""
                           Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das 
                           fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa 
                           que leva presa ao cinto.""");
        Rules.lineCombat();
        Rules.continuar();
    }

    public static void levelFive() {
        System.out.println("""
                           Voc� retorna � sala anterior e se dirige � porta da esquerda. Voc� se aproxima, 
                           tentando ouvir o que acontece porta adentro, mas n�o escuta nada. Segura com mais
                           for�a sua arma com uma m�o, enquanto empurra a porta com a outra. Ao entrar, voc� 
                           se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem 
                           v�rios potes e garrafas de vidro com conte�dos misteriosos e de cores diversas, e 
                           voc� entende que o capit�o que vive ali, realiza experimentos com diversos ingredientes, 
                           criando po��es utilizadas pelos soldados para aterrorizar a regi�o.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("""
                           No fundo da sala, olhando em sua dire��o, est� outro dos capit�es do inimigo.
                           Um orque horrendo, de armadura, cajado em punho, em posi��o de combate. Ele avan�a 
                           em sua dire��o.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        Rules.atoCincoCombateAlquimista();
        Rules.lineCombat();
        System.out.println("""
                           Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque
                           do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente 
                           rosado, pega a garrafa e pondera se deve beber um gole.""");
        Rules.lineCombat();
        Rules.continuar();
        Rules.clearConsole();
    }

    public static void levelSix() {
        System.out.println("""
                De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras,
                e a porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente,
                e voc� percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza,
                foca no combate que voc� sabe que ir� se seguir, e adentra a porta.""");
        Rules.lineCombat();
        Rules.continuar();
        System.out.println("""
                L� dentro, voc� v� o l�der sentado em uma poltrona dourada, com duas fogueiras de cada lado,
                e prisioneiros acorrentados �s paredes.                     
                Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de l�mina dupla.""");
        Rules.atoSeisCombateLider();
        Rules.lineCombat();
        System.out.println(Rules.jogador.getTipoMotivacao().getMensagemVitoria());
        Rules.lineCombat();
        Rules.continuar();
        Rules.lineCombat();
        System.out.println("""
                           Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, 
                           e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� 
                           cumprido.""");
    }
}
