
public class Moto extends MedioDeTransporte{
	
	Moto(int cantidad_pasajeros, double velocidad_maxima)
	{
		super (cantidad_pasajeros,velocidad_maxima);
	}

	
	
	int getCantidadDeLLantas()
	{
		return 2;
	}
	
	
}
