import java.util.*;
import java.util.stream.*;;


//Stream is an interface btw.
class Main {
  
  public static void main(String[] args) {
  
  //iterators

  ArrayList<Integer>list = new ArrayList<>();
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(11);

    
    Iterator<Integer>it = list.iterator();
    //hasnext() returns boolean value whether element exists or not.
    while(it.hasNext())
      {
        System.out.println(it.next());
      }


    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Iterator<String> ite = cars.iterator();

    // Print the first item
    System.out.println(ite.next());
    //print the second item
    System.out.println(ite.next());
    //print thurd item. when you call it.next(), it will print the item present there and the iterator will shift to next pointer.
    System.out.println(ite.next());




System.out.println("Before removing an element, the list looks like this : "+list);
  //Remove numbers from a collection.
    Iterator<Integer> ites = list.iterator();
    while(ites.hasNext()) {     
      if(ites.next() > 10) {
        ites.remove();//basically if an element is greater than 10, then remove that elemnt
      }
    }

    System.out.println("After removing an element, the list looks like this : "+list);
    
   
  }
}


