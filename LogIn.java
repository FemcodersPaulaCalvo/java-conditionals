import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.

        String userOK = "pCalvo";
        String passwordOK = "pCalvo";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Username:");
        String user = scanner.nextLine();

        System.out.print("Password:");
        String password = scanner.nextLine();


        String menssage = user.equals(userOK) && password.equals(passwordOK) ? "Access granted" : "Incorrect username or password";

        System.out.println(menssage);

        scanner.close();

    }
}
