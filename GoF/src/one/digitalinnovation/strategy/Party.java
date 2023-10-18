package one.digitalinnovation.strategy;

import java.util.Random;

public class Party {

    /*  A lógica de deslocamento é aplicada aqui. Por meio do "Random", optei por tornar o código mais divertido
        fazendo com que exista o fator aleatoriedade presente nas mesas de rpg, pode ocorrer do grupo ter sua viagem 
        interceptada por algum evento oportuno.
    */

    private int distanciaPercorrida = 0;
    private Comportamento ritmo;

    public Party(Comportamento ritmo) {
        this.ritmo = ritmo;
    }

    public int simulateTravel() {
        int travelDuration = 8;

        for (int hour = 1; hour <= travelDuration; hour++) {
            int randomValue = new Random().nextInt(100);
            boolean isInterruption = randomValue < 20;

            if (!isInterruption) {
                int partyDistancia = ritmo.deslocamento();
                distanciaPercorrida += partyDistancia;
            } else {
                System.out.println("Imprevisto!! Atraso na viagem!!");
            }
        }
        return distanciaPercorrida;
    }
}