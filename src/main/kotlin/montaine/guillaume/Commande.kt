package montaine.guillaume

import de.huxhorn.sulky.ulid.ULID;


data class Commande(val Id: String = ULID().nextULID() ) {

    val Lignes: List<LigneCommande> = new ArrayList<>()

}