package metier;

import java.time.LocalDate;

public class Facture
{
	private final Client client;
	private final LocalDate date;
	public int montant;
	public boolean estReglee;

	public Facture(int montant, Client client)
	{
		this.client = client;
		this.montant = montant;
		this.estReglee = false;
		this.date = LocalDate.now();
	}
	/**
	 * Retourne le client � qui est adress�e la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est regl�e.
	 * @return vrai ssi la facture est regl�e.
	 */
	
	public boolean estReglee()
	{
		return estReglee;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return null;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}