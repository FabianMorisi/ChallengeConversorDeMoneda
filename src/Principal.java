import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner lectura = new Scanner(System.in);
        String menu = """
                *********************************************
                [= Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dolar  =>>   Peso Argentino
                2) Peso Argentino   =>>   Dolar
                3) Dolar  =>>   Real Brasileño
                4) Real Brasileño   =>>   Dolar
                5) Dolar  =>>   Peso Colombiano
                6) Peso Colombiano   =>>   Dolar
                7) Salir
                
                Elija una opción Válida:
                *********************************************
                """;
        String ingrValor = "Ingrese el valor que desea Convertir: ";

        while (opcion != 7){
            System.out.println(menu);
            opcion = lectura.nextInt();
            System.out.println(ingrValor);
            Scanner teclado = new Scanner(System.in);
            String monedaBase;
            String monedaDestino;
            int cantidad;
            ConsultaCotizacion consulta = new ConsultaCotizacion();
            Cotizacion cotizacion;

            switch (opcion){
                case 1:
                    cantidad = teclado.nextInt();
                    monedaBase = "USD";
                    monedaDestino = "ARS";
                    consulta = new ConsultaCotizacion();
                    cotizacion = consulta.buscaCotizacion(cantidad, monedaBase, monedaDestino);
                    System.out.println("El valor "+cantidad+" ["+monedaBase+"] "
                            +"corresponde al valor final de =>> "
                            + cotizacion.conversion_result()+" ["+monedaDestino+"].");
                    break;
                case 2:
                    cantidad = teclado.nextInt();
                    monedaBase = "ARS";
                    monedaDestino = "USD";
                    consulta = new ConsultaCotizacion();
                    cotizacion = consulta.buscaCotizacion(cantidad, monedaBase, monedaDestino);

                    System.out.println("El valor "+cantidad+" ["+monedaBase+"] "
                            +"corresponde al valor final de =>> "
                            + cotizacion.conversion_result()+" ["+monedaDestino+"].");
                    break;
                case 3:
                    cantidad = teclado.nextInt();
                    monedaBase = "USD";
                    monedaDestino = "BRL";
                    consulta = new ConsultaCotizacion();
                    cotizacion = consulta.buscaCotizacion(cantidad, monedaBase, monedaDestino);
                    System.out.println("El valor "+cantidad+" ["+monedaBase+"] "
                            +"corresponde al valor final de =>> "
                            + cotizacion.conversion_result()+" ["+monedaDestino+"].");
                    break;
                case 4:
                    cantidad = teclado.nextInt();
                    monedaBase = "BRL";
                    monedaDestino = "USD";
                    consulta = new ConsultaCotizacion();
                    cotizacion = consulta.buscaCotizacion(cantidad, monedaBase, monedaDestino);
                    System.out.println("El valor "+cantidad+" ["+monedaBase+"] "
                            +"corresponde al valor final de =>> "
                            + cotizacion.conversion_result()+" ["+monedaDestino+"].");
                    break;
                case 5:
                    cantidad = teclado.nextInt();
                    monedaBase = "USD";
                    monedaDestino = "COP";
                    consulta = new ConsultaCotizacion();
                    cotizacion = consulta.buscaCotizacion(cantidad, monedaBase, monedaDestino);
                    System.out.println("El valor "+cantidad+" ["+monedaBase+"] "
                            +"corresponde al valor final de =>> "
                            + cotizacion.conversion_result()+" ["+monedaDestino+"].");
                    break;
                case 6:
                    cantidad = teclado.nextInt();
                    monedaBase = "COP";
                    monedaDestino = "USD";
                    consulta = new ConsultaCotizacion();
                    cotizacion = consulta.buscaCotizacion(cantidad, monedaBase, monedaDestino);
                    System.out.println("El valor "+cantidad+" ["+monedaBase+"] "
                            +"corresponde al valor final de =>> "
                            + cotizacion.conversion_result()+" ["+monedaDestino+"].");
                    break;
                case 7:
                    System.out.println("Finalizando el programa. OK.");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
