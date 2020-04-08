package lt.codeacademy.input;

import java.util.Scanner;

public class UserInput {

    Scanner scanner = new Scanner(System.in);

    public int intInput(){
        return scanner.nextInt();
    }

    public String getString(){
        return scanner.next();
    }
}
