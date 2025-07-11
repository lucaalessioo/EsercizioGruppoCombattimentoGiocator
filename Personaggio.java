public interface Personaggio { // Interfaccia Personaggio Usata per Strategy Pattern e Factory Pattern
    String azione();

    // attacca()
    // difendi()
    // cura()
    String getNome();

    public void setStrategiaAttacco(Personaggio_Strategy_Attacco strategiaAttacco);

    Personaggio_Strategy_Attacco getStrategiaAttacco();
}
