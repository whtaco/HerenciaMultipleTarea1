/*
Diseño de un algoritmo el cual va a representar una herencia múltiple, el cual estará
constituido por el funcionamiento de sensores el cual procederá a mostrar que sensor 
funciona primero al momento del funcionamiento de la cámara de compresión.
 */
package herenciamultipletarea1;

interface SensorMAP {
public default void Funcionamiento() {
    System.out.println("Funcionamiento del sensor MAP");
    System.out.println();
    System.out.println("Se da el funcionamiento en primer lugar del sensor MAP cuando"
            + "\nesta en proceso de Admisión");
   }
}
interface SensorMAF {

    public default void Funcionamiento() {
    System.out.println("Funcionamiento del Sensor MAF");
    System.out.println();
    System.out.println("Se da el funcionamiento en primer lugar del sensor MAF cuando"
            + "\nel flujo masico de aire entra a la camara de Combustión");
   }
}
public class HerenciaMultipleTarea1 implements SensorMAP, SensorMAF{
/*
@Override
public void Funcionamiento() {
//se puede elegir la implementación de una interfaz
//por ejemplo, escogemos que sea SensorMAP
SensorMAP.super.Funcionamiento();
}
*/
@Override
public void Funcionamiento() {
//se puede elegir la implementación de una interfaz
//por ejemplo, escogemos que sea SensorMAF
SensorMAF.super.Funcionamiento();
}
public static void main(String[] args) {
    System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
        System.out.println("Materia: PROGRAMACIÓN");
        System.out.println("Nombre: WILLIAM TACO");
        System.out.println("Docente: ING. LUIS GUERRA");
        System.out.println();
SensorMAF sensor = new HerenciaMultipleTarea1();
sensor.Funcionamiento();
}
}