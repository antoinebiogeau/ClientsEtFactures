package metier;

import java.util.ArrayList;
import java.util.List;

public class Client
{
	public String nom;
	/** 
	 * Cr�e un client.
	 * @param nom le nom du client. 
	 */
	
	public Client(String nom)
	{
		this.nom = nom;
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
		return null;
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */

	public List<Facture> getFactures()
	{
		return null;
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		return 0;
	}

	/**
	 * Cr�� une facture en pr�cisant si elle est regl�e.
	 * @param montant Le montant de la facture.
	 * @param reglee Vrai si la facture est regl�e.
	 * @return la facture cr��e.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
		return null;
	}	
	
	/**
	 * Retourne la liste des factures regl�es. 
	 * @return la liste des factures regl�es.
	 */

	public List<Facture> facturesReglees()
	{
		return null;
	}
	

	/**
	 * Retourne tous les clients cr��s.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		return null;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
	}
}