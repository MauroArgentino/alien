package model;

public class LinealProgramming {

	public static final boolean MAX = true;
	public static final boolean MIN = false;
	
	private boolean optimization;
	private int restrictions;
	private Equation [] ecuations;
	
	/**
	 * pre: cada ecuaci�n est� en una l�nea
	 * @param opti
	 * @param nRes
	 * @param ecuas
	 */
	public LinealProgramming (boolean opti, int nRes, String ecuas) {
		optimization = opti;
		restrictions = nRes;
		String[] ecuations = ecuas.split("\n");
		this.ecuations = new Equation[ecuations.length];
		for (int i = 0; i < ecuations.length; i++) {
			this.ecuations[i] = new Equation(ecuations[i]);
		}
	}
	
	public void simplexMethod() {
		
	}
}