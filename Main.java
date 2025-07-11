public class Main
{
    private static int loginRegistrazioneOpzione()
    {
        //variables declaration & init
        int loginRegisterOpzione = 0;

        //menu description
        System.out.println("\nGioco di combattimento");
        System.out.println("Scegliere un'opzione:");
        System.out.println("1: registrazione utente");
        System.out.println("2: login utente");
        System.out.println("0: esci");

        //menu input
        loginRegisterOpzione = GlobalScanner.readIntInput();
        System.out.print("\n");

        switch(loginRegisterOpzione)
        {
            //option 1
            case 1:
                //gestione utenti singleton
                SessionManager gestioneUtenti = SessionManager.getInstance();

                //username e password input
                String username = GlobalScanner.readStringInput("Inserire username", "Inserire uno username valido", true);
                String password = GlobalScanner.readStringInput("Inserire la password", "password non valida", true);

                //returns -1 if user registration failed
                if(!gestioneUtenti.registraUtente(username, password))
                {
                    return -1;
                }
                break;

            //option 2
            case 2:
                //gestione utenti singleton
                gestioneUtenti = SessionManager.getInstance();

                //username e password input
                username = GlobalScanner.readStringInput("Inserire username", "Inserire uno username valido", true);
                password = GlobalScanner.readStringInput("Inserire la password", "password non valida", true);

                //returns -1 if login failed
                if(!gestioneUtenti.loginUtente(username, password))
                {
                    return -1;
                }
                break;

            //exit
            case 0:
                break;

            //menu input not available
            default:
                System.out.println("Inserire un'opzione valida");
                break;
        }
    }

    public static void main(String[] args)
    {
        //inits scanner inputs
        GlobalScanner.InitScannerInputs();

        //variables declaration & init
        int loginRegistrazioneOp = 0;
        int giocoOp = 0;

        loginRegistrazioneOp = loginRegistrazioneOpzione();

        while(loginRegistrazioneOp != 0)
        {
            //se l'utente si è registrato
            //ritorna al menu della registrazione/login di un utente
            if(loginRegistrazioneOp == 1)
            {
                loginRegistrazioneOp = loginRegistrazioneOpzione();
                continue;
            }

            System.out.println("\nBENVENUTO NEL GIOCO!\n");

            do
            {
                //menu description
                System.out.println("Scegliere un'opzione:");
                System.out.println("1: Inserire il tipo di personaggio");
                System.out.println("2: Inserire il tipo d'attacco");
                System.out.println("3: Inserire il tipo d'attacco");
                System.out.println("0: logout");

                //menu input
                giocoOp = GlobalScanner.readIntInput();
                System.out.print("\n");

                switch(giocoOp)
                {
                    //option 1
                    case 1:
                        break;

                    //option 2
                    case 2:
                        break;

                    //logout player
                    case 0:
                        break;

                    //menu input not available
                    default:
                        System.out.println("Inserire un'opzione valida");
                        break;
                }
            }
            while(giocoOp != 0);

            loginRegistrazioneOp = loginRegistrazioneOpzione();
        }

        //closes scanner inputs
        GlobalScanner.CloseScannerInputs();
    }
}
