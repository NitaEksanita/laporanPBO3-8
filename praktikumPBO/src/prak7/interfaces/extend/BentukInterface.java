package prak7.interfaces.extend;

import prak7.interfaces.BentukKeliling;
import prak7.interfaces.BentukLuas;

public interface BentukInterface extends BentukKeliling, BentukLuas{
	public static final double PHI=3.14;
	public void tulis();
}
