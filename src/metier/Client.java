package metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Client
{
	public String nom;
	private List<Facture> factures = new ArrayList<Facture>();
	private static List<Client> clients = new ArrayList<Client>();
	/** 
	 * Cr�e un client.
	 * @param nom le nom du client. 
	 */
	
	public Client(String nom)
	{
		this.nom = nom;
		clients.add(this);
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Cr�� une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture cr��e.
	 */
	
	public Facture createFacture(int montant)
	{
		if (montant < 0) {
			System.out.println("Le montant d'une facture ne peut pas �tre n�gatif.");
			return null;
		}
		else 
		{
			Facture facture = new Facture(montant, this, false, LocalDate.now());
			factures.add(facture);
			return facture;
		}
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		List<Facture> Facture = new ArrayList<Facture>(factures);
		return Facture;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int montant=0;
		for(int i = 0;i<factures.size();i++)
		{
			montant=montant+factures.get(i).getMontant();
		}
		return montant;
	}

	/**
	 * Cr�� une facture en pr�cisant si elle est regl�e.
	 * param montant Le montant de la facture.
	 * param estreglee() Vrai si la facture est regl�e.
	 * @return la facture cr��e.
	 */

	public Facture createFacture(int montant, boolean estreglee)
	{
		if (montant < 0) {
			System.out.println("Le montant d'une facture ne peut pas �tre n�gatif.");
			return null;
		}
		else 
		{
			Facture facture = new Facture(montant, this, estreglee, LocalDate.now());
			factures.add(facture);
			return facture;
		}
	}	
	
	/**
	 * Retourne la liste des factures regl�es. 
	 * @return la liste des factures regl�es.
	 */

	public List<Facture> getFacturesReglees()
	{

		List<Facture> Facture = new ArrayList<Facture>();
		for(int i = 0;i<factures.size();i++)
		{
			if(factures.get(i).estReglee)
			{
				Facture.add(factures.get(i));
			}
		}
		return Facture;
	}

	/**
	 * Retourne tous les clients cr��s.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return new ArrayList<Client>(clients);
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		clients.remove(this);
	}

	public void deleteFacture(Facture facture) {
		factures.remove(facture);
	}
}
