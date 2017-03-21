package interfaces;

public interface Humano extends SerVivo{
	static final int CANTIDAD_ANIOS_MAXIMA=350;

	public abstract void respirar();
	public abstract void vivir();
}
