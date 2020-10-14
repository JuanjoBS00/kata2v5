package kata2v5;

import java.util.Iterator;
import java.util.Map;

public class Kata2v5 {

    public static void main(String[] args) {
        
       Integer[] data = {1, 4, 3, 7, 5, 4, 2, 7, 8, 34, 3, 9, 12, 5, 4, 12, 12, 12, 12};
       String[] data2 = {"Pablo", "Pedro", "Magdalena", "pepe", "María", "María", "Facundo", "pepe", "pepe"};
       
       Histogram meta_histogram = new Histogram(data2);
        
       Map<Integer, Integer> histogram;
       histogram = meta_histogram.getHistogram();
        
       Iterator <Map.Entry<Integer, Integer>> entries = histogram.entrySet().iterator();
       while (entries.hasNext()){
           Map.Entry<Integer, Integer> entry = entries.next();
           System.out.println("key = "+ entry.getKey() + " value = "+ entry.getValue());
       }
        
    }
    
}
