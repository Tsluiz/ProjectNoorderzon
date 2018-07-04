package nl.noorderzon.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tijdstip.class)
public abstract class Tijdstip_ {

	public static volatile SetAttribute<Tijdstip, Voorstelling> voorstellingPerTijdslot;
	public static volatile SingularAttribute<Tijdstip, String> tijd;
	public static volatile SingularAttribute<Tijdstip, Integer> id;
	public static volatile SingularAttribute<Tijdstip, String> dag;

}

