package lt.codeacademy.output;

public class Output {

    public void greeting(){
        System.out.println("Welcome to the Questionnaire");
    }

    public void mainMenuChoises(){
        spacer();
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        askForInput();
    }

    private void askForInput(){
        System.out.println("Input your choise: ");
    }

    private void spacer(){
        System.out.println("------------------");
    }
    private void emptyLine(){
        System.out.println();
    }

    public void somethingWentWrong() {
        System.out.println("Something went wrong");
    }

    public void askForName() {
        System.out.print("Input name: ");
        emptyLine();
    }

    public void askForPassword() {
        System.out.print("Input password: ");
        emptyLine();
    }
}
