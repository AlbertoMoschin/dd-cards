package org.studygroup.races;

import org.studygroup.abilities.Abilities;

import java.util.HashMap;

public enum AasimarSubRace {
    CAIDO("Caido", getAbilityMap(Abilities.STRENGTH, 1), getSubRacialTraitsMap("Consumo Radiante", "A partir do nível 3, uma vez por dia pode libertar energia celestial por 1 minuto ou até terminar o efeito com ação bônus. Ao ativar o efeito criaturas a até 3m devem passar em resistência de CAR baseada em CAR ou ficarem Assustadas até o fim do próximo turno. Uma vez por turno causa +nível dano necrótico em um de seus ataques ou magias.")),
    FLAGELO("Flagelo", getAbilityMap(Abilities.CONSTITUTION, 1), getSubRacialTraitsMap("Consumo Radiante", "A partir do nível 3, uma vez por dia pode libertar energia celestial por 1 minuto ou até terminar o efeito com ação bônus. Durante o efeito emana luz brilhante a 3m e luz baixa em mais 3m. Ao final de seu turno você e criaturas a até 3m sofrem ½ seu nível como dano radiante, e uma vez por turno causa +nível dano radiante em um de seus ataques ou magias.")),
    PROTETOR("Protetor", getAbilityMap(Abilities.WISDOM, 1), getSubRacialTraitsMap("Alma Radiante", "A partir do nível 3, uma vez por dia pode libertar energia celestial por 1 minuto ou até terminar o efeito com ação bônus. Durante o efeito recebe deslocamento de vôo 9m, e uma vez por turno causa +nível dano radiante em um de seus ataques ou magias."));

    private String subRaceName;

    private HashMap<Abilities, Integer> abilities;

    private HashMap<String, String> subRacialTraits;

    AasimarSubRace(String subRaceName, HashMap<Abilities, Integer> abilities, HashMap<String, String> subRacialTraits) {
        this.subRaceName = subRaceName;
        this.abilities = abilities;
        this.subRacialTraits = subRacialTraits;
    }

    private static HashMap<Abilities, Integer> getAbilityMap(Abilities ability, int points) {
        HashMap<Abilities, Integer> abilities = new HashMap<>();
        abilities.put(ability, points);
        return abilities;
    }

    private static HashMap<String, String> getSubRacialTraitsMap(String trait, String description) {
        HashMap<String, String> racialTraits = new HashMap<>();
        racialTraits.put(trait, description);
        return racialTraits;
    }

    public String getSubRaceName() {
        return subRaceName;
    }

    public HashMap<Abilities, Integer> getAbilities() {
        return abilities;
    }

    public HashMap<String, String> getSubRacialTraits() {
        return subRacialTraits;
    }

    @Override
    public String toString() {
        return "AasimarSubRace{" +
                "subRaceName='" + subRaceName + '\'' +
                ", abilities=" + abilities +
                ", subRacialTraits=" + subRacialTraits +
                '}';
    }
}
