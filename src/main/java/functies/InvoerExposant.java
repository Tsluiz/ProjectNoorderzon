package functies;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.Scanner;

import entities.Voorstelling;

public class InvoerExposant implements AutoCloseable {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("controller");

	public void close() {
		emf.close();
	}

	private Scanner reader;

	/**
	 * hier moet de naam van de voorstelling opgehaald worden uit het webformulier
	 * daarna moeten de voorstellingen met die naam worden teruggegeven aan de front-end
	 * mv
	 */



}