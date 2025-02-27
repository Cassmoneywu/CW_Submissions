import java.util.ArrayList;

public class Array_List_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//#1 
		//This is setting a new empty ArrayList
		ArrayList empty = new ArrayList();
		
	//2a
		//This is setting a new ArrayList declaring it as an integer
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
	//2b
		//This is setting a new ArrayList declaring it as a String	
		ArrayList<String> StringArrList2 = new ArrayList<String>();
	
//3a
	//Adding elements to the integer ArrayList
	intArrList.add(1);
	intArrList.add(2);
	intArrList.add(3);
	
// 3b
	//Adding elements to the String ArrayList
	StringArrList2.add("Alice");
	StringArrList2.add("bob");
	StringArrList2.add("Charlie");
	
//4a
	//setting the element '5' at index 2 in the integer ArrayList
	intArrList.add(2,5);
	System.out.println(intArrList);
	
//4b
	//setting the  element "Derek" at index 1 in the String ArrayList
	StringArrList2.add(1, "Derek");
	System.out.println(StringArrList2);
	
//5a
	//Getting the element at index 1 and the last element in the integer ArrayList
	System.out.println(intArrList.get(1));
	System.out.println(intArrList.get(intArrList.size()-1));
	
//5b
	//Getting the element at index 1 and the last element in the String ArrayList
	System.out.println(StringArrList2.get(1));
	System.out.println(StringArrList2.get(StringArrList2.size()-1));
	
//6a
	//Setting the value at index 0 to 0 and getting the previous value in the integer ArrayList
	System.out.println(intArrList.set(0, 0));
	System.out.println(intArrList.get(0));
	
//6b
	//Setting the value at index 0 to "Zero" and getting the previous value in the String ArrayList
	System.out.println(StringArrList2.set(0, "Zero"));
	System.out.println(StringArrList2.get(0));
	
//7a
	//Removing the last element from the integer ArrayList
	System.out.println(intArrList.remove(intArrList.size()-1));
	System.out.println(intArrList);
	
//7b
	//Removing the last element from the String ArrayList
	System.out.println(StringArrList2.remove(StringArrList2.size()-1));
	System.out.println(StringArrList2);
	
	
	
	
	}

}
