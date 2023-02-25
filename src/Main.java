public class Main {
    public static void main(String[] args) {
        int numero = 10;
        if (numero>0){
            System.out.println("Es positivo");
        }else if(numero==0){
            System.out.println("Es cero");
        }else {
            System.out.println("Es negativo");
        }

        int numeroWhile = 0;
        while(numeroWhile<3){

            numeroWhile++;
            System.out.println(numeroWhile);
        }
        int numeroDo = 3;
        do{
            System.out.println(numeroDo);
            numeroDo++;
        }while (numeroDo<3);

        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        var estacion = "Autumn";
        switch (estacion){
            case "Autumn":
                System.out.println("It is autumn");
                break;
            case "Spring":
                System.out.println("It is spring");
                break;
            case "Summer":
                System.out.println("It is summer");
                break;
            case "Winter":
                System.out.println("It is winter");
                break;
            default:
                System.out.println("This isn't a season");
        }

    }
}