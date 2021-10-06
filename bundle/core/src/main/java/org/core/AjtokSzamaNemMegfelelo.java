package org.core;

public class AjtokSzamaNemMegfelelo extends Exception {
	
	public AjtokSzamaNemMegfelelo(int ajtoszam) {
		super(String.valueOf(ajtoszam));
	}
}
