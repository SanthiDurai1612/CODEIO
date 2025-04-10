package exercisepgm_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class NoofgrandChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap<String,String> map=new HashMap<>();
          List<String> child=new ArrayList<>();
          List<String> grandchild=new ArrayList<>();
          map.put("santhi","durai");
          map.put("chandru", "durai");
          map.put("sathvik", "santhi");
          map.put("sammeee", "chandru");
          map.put("priya", "chandru");
          map.put("kriya", "santhi");
          
          String father="durai";
        
         
          for(Entry<String,String> entry:map.entrySet())
          {
        	  if(entry.getValue().equalsIgnoreCase(father))
        	  {
        		 child.add(entry.getKey());
        	  }
          }
         
          for(Entry<String,String> entry:map.entrySet())
          {
        	  
        	 if(child.contains(entry.getValue()) && !grandchild.contains(entry.getKey()) )
        		 {
        		 grandchild.add(entry.getKey());
        		 
        	 }
        	 
          }
         
          System.out.print(grandchild.size());
	}

}
