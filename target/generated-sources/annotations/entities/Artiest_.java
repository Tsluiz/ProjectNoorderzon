package entities;

import nl.noorderzon.entities.Artiest;
import nl.noorderzon.entities.Locatie;
import nl.noorderzon.entities.Voorstelling;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Artiest.class)
public abstract class Artiest_ {

	public static volatile SingularAttribute<Artiest, Locatie> vasteLocatie;
	public static volatile ListAttribute<Artiest, Voorstelling> voorstellingenVanArtiest;
	public static volatile SingularAttribute<Artiest, String> genre;
	public static volatile SingularAttribute<Artiest, String> naam;
	public static volatile SingularAttribute<Artiest, String> naamVoorstelling;

}

