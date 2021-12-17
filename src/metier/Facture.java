package metier;

import java.time.LocalDate;

public class Facture
{
	private Client client;
	private LocalDate date;
	public int montant;
	public boolean estReglee;

	public Facture(int montant, Client client, boolean estReglee, LocalDate date)
	{
		this.client = client;
		this.montant = montant;
		this.date = LocalDate.now();
		this.estReglee = estReglee();
		this.estReglee = estReglee;
		this.date = date;
	}

	/**
	 * Retourne le client à qui est adressée la facture..
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
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
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
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		client.deleteFacture(this);
	}
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return client.createFacture(getMontant());
	}
}
