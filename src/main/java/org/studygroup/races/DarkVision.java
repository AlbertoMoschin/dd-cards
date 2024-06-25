package org.studygroup.races;

public enum DarkVision {
    DEFAULT("Visão padrão"),
    DEFAULT_SUPERIOR("Trata luz baixa como luz normal e escuridão como luz baixa, ambos a até 18m"),
    BRIGHT("Trata escuridão a até 18m como Luz Baixa e luz baixa como brilhante"),
    BRIGHTER("Visão no escuro 36m");

    private String darkVision;


    DarkVision(String darkVision) {
        this.darkVision = darkVision;
    }

    public String getDarkVision() {
        return darkVision;
    }
}
