package one.digitalinnovation.strategy;

public class Travel {
    public static void main(String[] args) {

        // Classe main cuja a finalidade é demonstrar o uso das classes utilizando o padrão de projeto strategy

        Comportamento ritmoNormal = new ComportamentoDefault();
        Party normalParty = new Party(ritmoNormal);
        int normalDistance = normalParty.simulateTravel();
        System.out.println("Party com ritmo normal percorreu " + normalDistance + " km durante a viagem.");

        Comportamento ritmoLento = new ComportamentoDefensivo();
        Party slowParty = new Party(ritmoLento);
        int slowDistance = slowParty.simulateTravel();
        System.out.println("Party com ritmo lento percorreu " + slowDistance + " km durante a viagem.");

        Comportamento ritmoRapido = new ComportamentoFast();
        Party fastParty = new Party(ritmoRapido);
        int fastDistance = fastParty.simulateTravel();
        System.out.println("Party com ritmo rápido percorreu " + fastDistance + " km durante a viagem.");

        





       



       
        
        
    }
}
