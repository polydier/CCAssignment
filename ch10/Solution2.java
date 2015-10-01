package ch10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

//sort am array of strings so that anagrams are next to each other
public class Solution2 {
	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		test.add("you");
		test.add("hab");
		test.add("hai");
		test.add("ahb");
		test.add("ouy");
	    print(ArrayConvert(HashBuild(test)));
	}

	static public HashMap<String, String> HashBuild(ArrayList<String> forsort){
		HashMap<String,String> hashbuild=new HashMap<String,String>();
		for(String a:forsort){
			hashbuild.put(Stringsort(a), a);
		}
		return hashbuild;
	}
	
	static public String Stringsort(String str){	//sort the String
		char[] store = str.toCharArray();
		Arrays.sort(store);//sort the char[]	
		String newb = new String(store);//put the sorted array into new String type
		return newb;
	}
	
	static public ArrayList<String> ArrayConvert(HashMap<String,String> hash){
		ArrayList<String> result = new ArrayList<String>();
		for(String key:hash.keySet()){
			ArrayList<String> list = hash.get(key);//how to get many elements if the key point to many elements
			for(String t:list){
				result.add(t);
			}
		}
		return result;
	}
	
	static public void print(ArrayList<String> str){
		for(String t:str){
			System.out.println(t);
		}
	}
}
