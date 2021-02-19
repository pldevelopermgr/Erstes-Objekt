
public class Katze extends Tier {
	
	//Zeige was passieren soll, wenn eine neue Katze erstellt werden soll (Kostruktor)
	
	public Katze() 
	{
		
		//Mithilfe von extends kann man diese Klasse einer anderen Klasse unterordnen
		//Eine Katze ist ein Tier, deswegen Katze extends Tier
		
		//Rufe Methoden und Variablen aus der Überklasse mithilfe von this.methodeodervar auf 
		
		this.bekommeHunger();
		//Sollte ausgeben: Ich habe Hunger!
		
		this.werdeMüde();
		//Sollte ausgeben: Ich bin müde!
		
		this.Name = "Mauzi";
		System.out.println(this.Name);
		//Sollte ausgeben: Mauzi
	}
	
	//Erstelle eine neue Methode
	
	public void machEinenLaut()
	{
		System.out.println("Miau!");
	}

}
