package enums;

import lombok.Getter;

@Getter
public enum MotivationEnum {
    VINGANCA("VINGANÇA",
            """
                   Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois 
                   essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos 
                   em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que 
                   não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo
                   de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos 
                    (e principalmente na sua).""",
            "NÃO foi possível concluir sua vingança, e agora resta saber se alguém se vingara¡ por voce.",
            "Voce obteve sua vingança. Voce se ajoelha e cai no choro, invadido por uma sensação de ali­vio e\n" +
                    "felicidade. Voce se vingou, tudo que sempre quis, esta feito. Agora voce pode seguir sua vida."),

    GLORIA("GLÓRIA",
            """
            Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos,
            bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas
            riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente
            o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto
            assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se 
            concentra na missão. A glória o aguarda, mas não antes da última batalha.""",
            "A glória que buscavas não sera sua, e a cidade aguarda por seu(sua) próximo(a) heroi(na).",
            "O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.");

    private final String motivacao;
    private final String textoMotivacao;
    private final String mensagemMorte;
    private final String mensagemVitoria;


    MotivationEnum(String motivacao, String textoMotivacao, String mensagemMorte, String mensagemVitoria) {
        this.motivacao = motivacao;
        this.textoMotivacao = textoMotivacao;
        this.mensagemMorte = mensagemMorte;
        this.mensagemVitoria = mensagemVitoria;
    }


}
