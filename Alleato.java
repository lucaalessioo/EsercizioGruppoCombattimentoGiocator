public class Alleato implements OsservatoreGioco{
    private String name;

    public Alleato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void aggiornaNotifica(Notifica notifica) {
        System.out.println(name + " ha ricevuto una notifica: " + notifica.getMessaggio());
        
    }





    
}
