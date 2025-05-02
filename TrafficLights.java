public class TrafficLights {
    public static void main(String[] args) {

        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado

//        String trafficLight = "Yellow";
//        String trafficLight = "RED";
        String trafficLight = "bLACK";



        switch (trafficLight.toLowerCase()){
            case "green":
                System.out.println("You can continue");
                break;
            case "yellow":
                System.out.println("Be careful");
                break;
            case "red":
                System.out.println("¡¡¡Stop!!!");
                break;
            default:
                System.out.println("The traffic light is damaged");
        }

        //Cambia el valor de la variable, corre el programa y mira el resultado

    }

}

