package ud.prog3.pr02;

/** Clase para definir instancias lógicas de coches con posición, dirección y velocidad.
 * @author Andoni Eguíluz
 * Facultad de Ingeniería - Universidad de Deusto (2014)
 */
public class Estrella {
	
	protected double posX;  // Posición en X (horizontal)
	protected double posY;  // Posición en Y (vertical)
	
	protected JLabelEstrella miGrafico; //grafico de la estrella
	protected double miDireccionActual;

	// Constructores
	public Estrella(double posX, double posY, long horaCreacion) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.miDireccionActual=0;
		miGrafico=new JLabelEstrella((int)posX,(int)posY);
		miGrafico.setHoraCreacion(horaCreacion);
	}
	
	public Estrella(){
		super();
	}
	

	public double getPosX() {
		return posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosicion( double posX, double posY ) {
		setPosX( posX );
		setPosY( posY );
	}
	
	public void setPosX( double posX ) {
		this.posX = posX; 
	}
	
	public void setPosY( double posY ) {
		this.posY = posY; 
	}
	

	
	/**
	 * @return the miGrafico
	 */
	public JLabelEstrella getMiGrafico() {
		return miGrafico;
	}

	/**
	 * @param miGrafico the miGrafico to set
	 */
	public void setMiGrafico(JLabelEstrella miGrafico) {
		this.miGrafico = miGrafico;
	}

	/**
	 * @return the miDireccionActual
	 */
	public double getMiDireccionActual() {
		return miDireccionActual;
	}

	/**
	 * @param miDireccionActual the miDireccionActual to set
	 */
	public void setMiDireccionActual(double miDireccionActual) {
		this.miDireccionActual = miDireccionActual;
	}

	/** Cambia la dirección actual del coche
	 * @param giro	Angulo de giro a sumar o restar de la dirección actual, en grados (-180 a +180)
	 * 				Considerando positivo giro antihorario, negativo giro horario
	 */
	public void gira( double giro ) {
		setMiDireccionActual(miDireccionActual + giro);
	}
	
	
}
