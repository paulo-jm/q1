package br.com.netshoes.q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author MoreiraP
 * 
 */
public class StreamImp implements Stream {

	public static Map<String, String> mapGroupPorVogal;

	public static List<String> groups;

	private int next = 0;

	public StreamImp(String stream) {

		mapGroupPorVogal = new HashMap<String, String>();
		groups = new ArrayList<String>();

		Pattern r = Pattern.compile(PATTERN);

		Matcher m = r.matcher(stream);
		carregarGruposDeVogais(m);

	}

	public boolean hasNext() {

		if (groups.isEmpty() || groups.size() <= next) {
			return false;
		}

		return true;
	}

	public String getNext() {
		String value = groups.get(next);
		next++;
		return value;
	}

	public int size() {
		return groups.size();
	}

	/**
	 * Metodo Cria um lista de String com grupos de string, consoante e vogais,
	 * em que vogais não repita.
	 * 
	 * @param m
	 */
	private static void carregarGruposDeVogais(Matcher m) {

		while (m.find()) {

			String group = m.group().toLowerCase();

			String vogal = group.replaceAll(PATTERN_CONSOANTE, "");

			if (mapGroupPorVogal.containsKey(vogal)) {
				groups.remove(mapGroupPorVogal.get(vogal));
			} else {
				mapGroupPorVogal.put(vogal, group);
				groups.add(group);
			}

		}

	}

}
