import java.util.Scanner;

public class AdivinaElnumero {

    public class AdivinaElNumero{
        private Scanner entrada = new Scanner(System.in);
        private boolean JuegoActivo = true;

        public void jugar () {
                System.out.println("Hola,di tu nombre");
                String nombreJugador = entrada.nextLine();
                System.out.printf("Bienvenido %s, vamos a empezar", nombreJugador);

            while (JuegoActivo){
                int min = 0;
                int max = 100;
                int numeroJuego = (int) (Math.random() *((max-min) + 1));
                System.out.println(numeroJuego);

                JuegoActivo = false;

            }


        }

    }
}
