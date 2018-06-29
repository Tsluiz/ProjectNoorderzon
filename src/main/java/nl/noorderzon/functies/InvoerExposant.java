package nl.noorderzon.functies;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class InvoerExposant implements AutoCloseable {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("nl/noorderzon/controller");

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