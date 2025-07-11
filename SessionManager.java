public class SessionManager {

    private static SessionManager instance;
    private String utenteLoggato;
    private Personaggio_Strategy_Attacco strategia;

    private SessionManager() {

    }

    public static SessionManager getInstance() {
        if(instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    // Metodo per loggare 
    public void login(String username) {
        this.utenteLoggato = username; 
        System.out.println("Utente '" + username + "' loggato con successo.");
    }

    // Metodo per fare il logout
    public void logout() {
        if (utenteLoggato != null) {  // Se è divero da null 
            System.out.println("Utente '" + utenteLoggato + "' disconnesso.");  // Stampo la disconnessione
            this.utenteLoggato = null;      // Imposto su null cosi la prossima volta non entra nell if
        } else {
            System.out.println("Nessun utente loggato.");
        }
    }

    // Possibile metodo per vedere se l utente è loggato oppure no
    public boolean controlloSeLoggato() {
        return utenteLoggato != null;
    }

    public void setStrategia(Personaggio_Strategy_Attacco strategia)
        this.strategia = strategia;
}


// Facade
class GameEngineFacade {

    private SessionManager sessionManager = SessionManager.getInstance();

    public void accedi(String username) {
        if(!sessionManager.controlloSeLoggato()) {
        sessionManager.login(username);
        } else {
            System.out.println(" Utente gia loggato!");
        }
    }

    public void esci() {
        if(sessionManager.controlloSeLoggato()) {
        sessionManager.logout();
        } else {
            System.out.println(" Utente non loggato non puoi scloggarti! ");
        }
    }

    public void impostaStrategia(Personaggio_Strategy_Attacco strategia) {
            sessionManager.setStrategia(strategia);
    }


}