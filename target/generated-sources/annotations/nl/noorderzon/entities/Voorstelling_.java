package nl.noorderzon.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Voorstelling.class)
public abstract class Voorstelling_ {

	public static volatile SingularAttribute<Voorstelling, Integer> capaciteit;
	public static volatile SingularAttribute<Voorstelling, Artiest> artiest;
	public static volatile SingularAttribute<Voorstelling, Tijdstip> tijdstip;
	public static volatile SingularAttribute<Voorstelling, Integer> id;

}

