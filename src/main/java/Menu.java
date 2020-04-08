
import lt.codeacademy.entities.Person;
import lt.codeacademy.input.UserInput;
import lt.codeacademy.output.Output;
import lt.codeacademy.services.AppService;

public class Menu {
    private Output output = new Output();
    private UserInput input = new UserInput();
    private AppService appService = new AppService();
    private boolean exit;


    public void startMenu() {
        output.greeting();
        while (!exit) {
            output.mainMenuChoises();
            int choise = input.intInput();
            loginOrRegister(choise);

        }
    }

    private void loginOrRegister(int choise) {
        switch (choise) {
            case 1:
                login();
                break;
                case 2:
//           register();
                break;
            default:
                output.somethingWentWrong();
                break;
        }
    }

    private void login() {
        output.askForName();
        String name = input.getString();
        output.askForPassword();
        String password = input.getString();
        Person person = appService.loginPerson(name,password);
        System.out.println(person.toString());

    }


}
