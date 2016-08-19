package br.com.netshoes.q1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StreamImpTest {
		
	public static String VALUE = "aaAbBABacfegifufa";
	
	public static int QUANTIDADE = 3;

	public StreamImp stream;
	
	@Before
	public void init() {
		stream = new StreamImp(VALUE);
	}
	
	@Test
	public void hasNext() {
		Assert.assertTrue(stream.hasNext());		
	}


	@Test
	public void getNext() {
		Assert.assertTrue(stream.getNext().equalsIgnoreCase("fe"));
	}


	@Test
	public void size() {
		Assert.assertTrue(stream.size() == QUANTIDADE);
	}
	
	
}
