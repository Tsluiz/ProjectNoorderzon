package nl.noorderzon.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Locatie.class)
public abstract class Locatie_ {

	public static volatile SingularAttribute<Locatie, Integer> maxCapaciteit;
	public static volatile SetAttribute<Locatie, Artiest> artiestenVanDezeLocatie;
	public static volatile SingularAttribute<Locatie, Integer> id;
	public static volatile SingularAttribute<Locatie, String> naam;

}

