package org.ss.entites;
/** Pièce de type salon
 * @author ssylla
 *
 */
public class Salon extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public Salon(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return TYPE_SALON;
	}
}