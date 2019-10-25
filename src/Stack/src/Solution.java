import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Solution{
  
  public static void main (String[] args){
    
    Solution sol = new Solution();
    calculatePortfolio(sol.map);
    
  }
  
 public static HashMap<String, ArrayList<Portfolio>> map = new HashMap<>();
  
  Solution() {
  ArrayList<Portfolio>  list = new ArrayList<Portfolio>();
  Portfolio pobj= new Portfolio(3,200);
  Portfolio pobj1 =new Portfolio(11,400);
  list.add(pobj);
  list.add(pobj1);
  map.put("AMZN",list);
  
  ArrayList<Portfolio>  list1 = new ArrayList<Portfolio>();
  Portfolio obj1= new Portfolio(3,400);
  Portfolio obj2= new Portfolio(5,500);
  Portfolio obj13=new Portfolio(9,700);
  list1.add(obj1);
  list1.add(obj2);
  list1.add(obj13);
  map.put("MSFT",list1);
  
  ArrayList<Portfolio>  list3 = new ArrayList<Portfolio>();
  Portfolio obj3= new Portfolio(5,200);
  Portfolio obj4 =new Portfolio(11,600);
  list3.add(obj3);
  list3.add(obj4);
  map.put("GOOG",list3);
  }
  
  static void calculatePortfolio(HashMap<String, ArrayList<Portfolio>> map) {
    
    //loop through HashMap
    //Get the days in asc order and sum the stock values
    
    int[] curren_day={3,5,9,11};
    int sum=0, k=0;
    ArrayList<Portfolio> temp = null;
    
    
   for(int i=0;i<curren_day.length;i++) {
	   int curr = curren_day[i];
	   sum = 0;
	   Iterator it = map.entrySet().iterator();
	   while(it.hasNext()) {
		   Map.Entry<String, ArrayList<Portfolio>> pair =  (Entry<String, ArrayList<Portfolio>>) it.next();
		   temp = pair.getValue();
		   while(!temp.isEmpty() && k< temp.size()) {
			   Portfolio ob = temp.get(k);
			   
			   if(ob.day == curr) {
				   sum = sum + ob.stock;
			   }
			   else if(ob.day < curr) {
				  
			   }
			   k++;
		   }
		   k=0;
		   temp=null;
	   }
	   System.out.println(curr+" "+ sum);
   }
    
  }
}