package org.ss.entites;
/** Pièce de type chambre
 * @author ssylla
 *
 */
public class Chambre extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public Chambre(int etage, double superficie) {
		super(etage, superficie);
	}

	@Override
	public String getType() {
		return TYPE_CHAMBRE;
	}

}