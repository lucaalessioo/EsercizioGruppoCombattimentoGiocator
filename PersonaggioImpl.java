
abstract class PersonaggioImpl implements Personaggio { // Classe astratta che implementa l'interfaccia Personaggio
    protected String nome;
    protected int salute;
    protected int forza;
    protected String classe;
    protected Personaggio_Strategy_Attacco strategiaAttacco;

    public Personaggio_Strategy_Attacco getStrategiaAttacco() {
        return strategiaAttacco;
    }

    public void setStrategiaAttacco(Personaggio_Strategy_Attacco strategiaAttacco) {
        this.strategiaAttacco = strategiaAttacco;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public PersonaggioImpl(String nome) {
        this.nome = nome;
        this.salute = (int) Math.random() * 300 + 300; // Salute casuale tra 300 e 600
        this.forza = (int) Math.random() * 18 + 18; // Forza casuale tra 18 e 36
    }

    @Override
    public String toString() {
        return "PersonaggioImpl [nome=" + nome + ", salute=" + salute + ", forza=" + forza + "]";
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }

    public int getForza() {
        return forza;
    }

    public void setForza(int forza) {
        this.forza = forza;
    }

    @Override
    public String azione() {
        return "Il personaggio compie un'azione.";
    }

    // Implementazione dei metodi attacca(), difendi(), cura() se necessario
}

class Guerriero extends PersonaggioImpl {
    public Guerriero(String nome) {
        super(nome);
    }

    @Override
    public String azione() {
        return "Il guerriero attacca con forza!";
    }
}

class Mago extends PersonaggioImpl {
    public Mago(String nome) {
        super(nome);
    }

    @Override
    public String azione() {
        return "Il mago lancia un incantesimo!";
    }
}

class Arciere extends PersonaggioImpl {
    public Arciere(String nome) {
        super(nome);
    }

    @Override
    public String azione() {
        return "l'arciere scocca una freccia!";
    }
}