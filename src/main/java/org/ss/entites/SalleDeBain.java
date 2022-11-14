package org.ss.entites;
/** Pièce de type salle de bain
 * @author ssylla
 *
 */
public class SalleDeBain extends Piece {

	/** Constructeur
	 * @param etage étage
	 * @param superficie superficie
	 */
	public SalleDeBain(int etage, double superficie) {
		super(etage, superficie);
	}
	
	@Override
	public String getType() {
		return TYPE_SDB;
	}

}