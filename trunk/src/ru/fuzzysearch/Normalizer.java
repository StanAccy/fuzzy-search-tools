package ru.fuzzysearch;

/**
 * Нормализатор строк, использующийся при генерации словаря и предварительной обработке поискового запроса.
 */
public interface Normalizer {

	/**
	 * Нормализует переданное слово для последующего использования в поисковых алгоритмах
	 * 
	 * @param word
	 *            слово
	 * @return нормализованное слово, либо пустую строку в случае несоответствия какому-либо критерию.
	 */
	public String normalize(String word);
}
