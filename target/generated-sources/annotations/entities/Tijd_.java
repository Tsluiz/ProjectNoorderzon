package entities;

import nl.noorderzon.entities.Tijd;
import nl.noorderzon.entities.Voorstelling;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tijd.class)
public abstract class Tijd_ {

	public static volatile ListAttribute<Tijd, Voorstelling> voorstellingPerTijdslot;
	public static volatile SingularAttribute<Tijd, String> tijdstip;
	public static volatile SingularAttribute<Tijd, Integer> id;
	public static volatile SingularAttribute<Tijd, String> dag;

}

