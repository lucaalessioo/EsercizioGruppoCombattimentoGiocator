public class TestFactory {

    // Test factory e Strategy Pattern per Personaggio
    public static void main(String[] args) {
        FactoryPersonaggio factoryGuerriero = new FactoryGuerriero(); // Crea un factory per Guerriero
        Personaggio conan = factoryGuerriero.azioneCreazionePersonaggio("Conan");
        conan.setStrategiaAttacco(new Attacco_Meelee());

        FactoryPersonaggio factoryMago = new FactoryMago();
        Personaggio gandalf = factoryMago.azioneCreazionePersonaggio("Gandalf");
        gandalf.setStrategiaAttacco(new Attacco_Mage());

        FactoryPersonaggio factoryArciere = new FactoryArciere();
        Personaggio legolas = factoryArciere.azioneCreazionePersonaggio("Legolas");
        legolas.setStrategiaAttacco(new Attacco_Ranger()); // O crea una strategia per arciere

        // Esempio di utilizzo
        System.out.println(conan.getNome() + ": " + conan.getStrategiaAttacco().attacca());
        System.out.println(gandalf.getNome() + ": " + gandalf.getStrategiaAttacco().attacca());
        System.out.println(legolas.getNome() + ": " + legolas.getStrategiaAttacco().attacca());
    }
}