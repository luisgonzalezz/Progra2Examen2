
public class MedioDeTransporte {
	int cantidad_pasajeros;
	double velocidad_maxima;
	
	
	MedioDeTransporte (int cantidad_pasajeros, double velocidad_maxima)
	{
		this.cantidad_pasajeros=cantidad_pasajeros;
		this.velocidad_maxima=velocidad_maxima;
	}
	
	int getCantidadPasajeros()
	{
		return cantidad_pasajeros;
	}
	
	double getVelocidadMaxima()
	{
		return velocidad_maxima;
	}
	
	int getCantidadDeLLantas()
	{
		return 0;
	}
	
	
	
	
	

}
