package com.tasks.problem;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.HashMap;

import java.util.HashSet;

import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

import java.util.Set;

import java.util.Map.Entry;

import java.util.stream.Collectors;

public class WordAnalyzerService {

private static final String FILE_PATH = "words.txt";



String fileData;



String[] words;



Set<String> set = new HashSet<String>();



Map<String, Long> map = new HashMap<String, Long>();



/**

 * 

 * @return number of words present in the file words.txt

 * @throws Exception 

 */

public long readFileAndReturnNoOfWords()  throws IOException {

	

		StringBuilder sb =new StringBuilder();

		try(BufferedReader br=new BufferedReader(new FileReader(FILE_PATH)))

		{

			String line;

			while((line=br.readLine())!=null){

				sb.append(line).append(" ");

			}

		}

		fileData=sb.toString().trim();

		words=fileData.split("\\W+");

		

	

		//@todo Use BufferedReader to read the file and store the words into words variable

		// delete the last new line separator

	

	return words.length;

}



/*

 * 

 * @return the unique words present in the file. These words should be populated in the set variable declared above.

 */

public long createSetOfUniqueWordsAndReturnUniqueCount() throws IOException {

		if(words == null) {

			readFileAndReturnNoOfWords();

		}

	//@todo  Add words to the collection uniquely

	for(String word:words){

		if(!word.isEmpty()){

			set.add(word);

		}

	}

	 



return set.size();

}



/**

 * Populate the map variable with key-value mapping of word-count, count representing how many times the word appeared in the file.

 */

public void createMapOfWord_Count() throws IOException{

	if(words == null) {

		readFileAndReturnNoOfWords();

	}

	//@todo Populate the map variable by writing appropriate code

	for(String word:words){

		String key=word.toLowerCase();

		map.compute(key,(k,v)->(v==null)?1L:v+1);

	}

	 

}

	

 





/**

 * 

 * @param word - input word 

 * @return the number of times the input word appeared in the file

 */

public long getOccurrencesOf(String word) throws IOException{

	if(map.keySet().size() == 0) {

		createMapOfWord_Count();

	}

	//@todo Get the count

	return map.getOrDefault(word.toLowerCase(),0L);

}



/**

 * 

 * @return topp 3 words sorted (desc) by number of occurrences in the file

 */

public List<String> findThreeMostCommonWords() throws IOException{

	if(map.isEmpty()){

		createMapOfWord_Count();

	}



	

	List<String> top3Lower= map.entrySet().stream()

	.sorted(Map.Entry.<String,Long>comparingByValue().reversed())

	.limit(3)

	.map(Map.Entry::getKey)

	.collect(Collectors.toList());



	List<String> result=new ArrayList<>();

	for(String key: top3Lower){

		for(String original:words){

			if(original.equalsIgnoreCase(key)){

				result.add(original);

				break;

			}

		}

	}

	return result;





}

	



/**

 * Sort the map keys based on key value with most commonly used word at the top.

 * @param hm

 * @return

 */

private static Map<String, Long> 

sortByValue(Map<String, Long> hm)

{

	//@todo Sort the map on the basis of value of the key in the Map.

    

	// Creating a list from elements of HashMap

	List<Entry<String,Long>>list=new ArrayList<>(hm.entrySet());



    // Sorting the list using Collections.sort() method

	Collections.sort(list,new Comparator<Map.Entry<String,Long>>(){

		public int compare(Map.Entry<String,Long>o1,Map.Entry<String,Long>o2){

			return (o2.getValue()).compareTo(o1.getValue());

		}

	});

    // using Comparator



    // putting the  data from sorted list back to hashmap

	Map<String,Long>temp=new LinkedHashMap<>();

	for(Map.Entry<String,Long>aa:list){

		temp.put(aa.getKey(),aa.getValue());

	}



    // returning the sorted HashMap

	

	return temp;

}

}
