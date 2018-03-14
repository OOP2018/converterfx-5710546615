package converter;

/**
 * Length that can be used.
 * 
 * @author Visurt Anuttivong
 */
public enum Length {
	Meter(1.0000), 
	Centimeter(0.0100), 
	Kilometer(1000.0), 
	Mile(1609.344), 
	Foot(0.30480), 
	Wa(2.00000), 
	AU(149597870700.0);

	/* attributes of the enum members */
	private final double value;

	/**
	 * Initialize a new Length.
	 * 
	 * @param value is unit's value
	 */
	private Length(double value) {
		this.value = value;
	}

	/**
	 * Gets the value of the unit.
	 * 
	 * @return unit's value
	 */
	public double getValue() {
		return this.value;
	}
}
