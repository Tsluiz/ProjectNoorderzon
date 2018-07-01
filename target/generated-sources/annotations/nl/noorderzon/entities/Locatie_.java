package nl.noorderzon.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Locatie.class)
public abstract class Locatie_ {

	public static volatile SingularAttribute<Locatie, Integer> maxCapaciteit;
	public static volatile SingularAttribute<Locatie, Integer> idlocatie;
	public static volatile ListAttribute<Locatie, Artiest> artiestenVanDezeLocatie;
	public static volatile SingularAttribute<Locatie, String> naam;

}

