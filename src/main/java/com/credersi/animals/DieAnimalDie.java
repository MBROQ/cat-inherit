package com.credersi.animals;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue; //same as expect to on jest
import org.junit.Test;

public class DieAnimalDie {

	@Test
	public void ElephantDies() {
		Elephant Elephant= new Elephant();{
		for(int i=0; i< 10;i++){
			Elephant.runs();
			Elephant.runs();
			
		
}
		assertTrue(Elephant.isAlive()==false);
	}
		}
}
