package nl.noorderzon.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Artiest.class)
public abstract class Artiest_ {

	public static volatile SingularAttribute<Artiest, Locatie> vasteLocatie;
	public static volatile SetAttribute<Artiest, Voorstelling> voorstellingenVanArtiest;
	public static volatile SingularAttribute<Artiest, String> genre;
	public static volatile SingularAttribute<Artiest, Integer> idartiest;
	public static volatile SingularAttribute<Artiest, String> naam;
	public static volatile SingularAttribute<Artiest, String> naamVoorstelling;

}

