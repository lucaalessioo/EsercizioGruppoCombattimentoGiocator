abstract class FactoryPersonaggio { // Classe astratta per Factory Pattern
    protected abstract Personaggio creaPersonaggio(String nome);

    public Personaggio azioneCreazionePersonaggio(String nome) {
        // Metodo factory che crea un personaggio e imposta la strategia di attacco
        Personaggio personaggio = creaPersonaggio(nome);
        System.out.println(personaggio.azione());
        return personaggio;
    }
}

// 4. I ConcreteCreator implementano il factory method
class FactoryGuerriero extends FactoryPersonaggio {
    @Override
    protected Personaggio creaPersonaggio(String nome) {
        return new Guerriero(nome);
    }
}

class FactoryArciere extends FactoryPersonaggio {
    @Override
    protected Personaggio creaPersonaggio(String nome) {
        return new Arciere(nome);
    }
}

class FactoryMago extends FactoryPersonaggio {
    @Override
    protected Personaggio creaPersonaggio(String nome) {
        return new Mago(nome);
    }
}
