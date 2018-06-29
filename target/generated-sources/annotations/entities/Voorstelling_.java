package entities;

import nl.noorderzon.entities.Artiest;
import nl.noorderzon.entities.Voorstelling;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Voorstelling.class)
public abstract class Voorstelling_ {

	public static volatile SingularAttribute<Voorstelling, Integer> capaciteit;
	public static volatile SingularAttribute<Voorstelling, Artiest> id;

}

