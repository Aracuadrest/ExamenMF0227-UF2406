/**
 * Clase Utilidades
 */
package funciones;
/**
 * Clase que modela la función devuelveNota
 * <p>@author Araceli Cuadra</p>
 *
 */
public class Utilidades {

	/**
	 * Método al que le pasamos por parámetro una nota media y nos devuelve
	 * un String indicandonos si tenemos Matrícula, Suspenso, Bien, Notable 
	 * o Sobresaliente.
	 * @param nota double, número que es la nota
	 * @return String descripción de la nota que puede ser Matrícula, Suspenso, Bien, Notable
	 * o Sobresaliente.
	 * @throws ArithmeticException que se lanza si la nota es inferior a 0 o superior a 10.
	 */

	public static String devuelveNota(double nota) {
		String descripcion = "Matrícula";
		
		if (nota<0.0 || nota >10) {
			throw new ArithmeticException("La nota debe estar entre 0.0 y 10");
		} else if (nota<5.0) {
			descripcion="Suspenso";
		} else if (nota <6.5) {
			descripcion = "Bien";
		} else if (nota<8.5) {
			descripcion ="Notable";
		} else if (nota<10) {
			descripcion ="Sobresaliente";
		} else {
			descripcion = "Matrícula";
		}
		return descripcion;
	}
}