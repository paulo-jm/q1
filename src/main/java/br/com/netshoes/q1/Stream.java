package br.com.netshoes.q1;

/**
 * 
 * @author MoreiraP
 *
 */
public interface Stream {
		
	String PATTERN = "[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxZz]{1}[AaEeIiOoUu]{1}";
	
	String PATTERN_CONSOANTE = "[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxZz]";
	
	/**
	 * Verifica se existe um proximo grupo de string.
	 * @return
	 */
	boolean hasNext();
	
	/**
	 * recupera proximo grupo de string.
	 * @return
	 */
	String getNext();
	
	/**
	 * Retorna quantidade do grupos de string encontrados.
	 * @return
	 */
	int size();
	
}
