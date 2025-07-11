
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Notifica {
    private String messaggio;

    public Notifica(String messaggio) {
        this.messaggio = messaggio;
    }

    public String getMessaggio() {
        return messaggio;
    }
}

abstract class NotificaDecorator extends Notifica {
    protected Notifica notificaDecorata;

    public NotificaDecorator(Notifica notificaDecorata) {
        super(notificaDecorata.getMessaggio());
        this.notificaDecorata = notificaDecorata;
    }

    @Override
    public String getMessaggio() {
        return notificaDecorata.getMessaggio();
    } 
}

class NotificaConTimestamp extends NotificaDecorator {

    public NotificaConTimestamp(Notifica notificaDecorata) {
        super(notificaDecorata); 

    }

    @Override
    public String getMessaggio() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String timeStamp = LocalDateTime.now().format(formatter);
        return "[" + timeStamp + "] " + super.getMessaggio();
    }
    
}

class NotificaConColore extends NotificaDecorator {
    private String colore;

    public NotificaConColore(Notifica notificaDecorata, String colore) {
        super(notificaDecorata); 
        this.colore = colore;
    }
    
    public String getColore() {
        return colore;
    }



    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public String getMessaggio() {
        return super.getMessaggio() + colore;
    }
}

class NotificaConAllerta extends NotificaDecorator {
    private String allerta;

    public NotificaConAllerta(Notifica notificaDecorata, String allerta) {
        super(notificaDecorata); 
        this.allerta = allerta;
    }
    
    public String getAllerta() {
        return allerta;
    }

    public void setAllerta(String allerta) {
        this.allerta = allerta;
    }

    @Override
    public String getMessaggio() {
        return "[" + allerta.toUpperCase() + "] " + super.getMessaggio();
    }
}

class NotificatoreAzione {
    public void notificaOsservatori(List<Personaggio> alleati, Notifica notifica) {
        for (OsservatoreGioco osservatore : osservatori) {
            osservatore.aggiornaNotifica(notifica);
        }
    }
}

