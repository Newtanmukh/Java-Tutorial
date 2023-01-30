import java.util.*;
import java.util.stream.*;;


//Stream is an interface btw.
class Main {
  static int age;
  public static void main(String[] args) {
  
  /*  Stream<Object>emptyStream=Stream.empty();
    emptyStream.forEach(e->{
      System.out.println(e);
   });*/

    //Arrays cannot be converted into stream direcyly using the .stream() method. you will have to use the Stream.of(array_name) method.
    
    String names[]={"first","second","third"};
    Stream<String>stream1=Stream.of(names);
    stream1.filter(e-> e.length()>5).forEach(e->{ //you can also use stream1.forEach(e->{}) here.
      System.out.println(e);
    });


  List<Integer>list1=new ArrayList<>(Arrays.asList(2,3,54,211));//arraylist is like child of List. we can always store an object of child class into that of a parent class.
  list1.add(55);
  list1.add(45);
    
  Stream<Integer>stream=list1.stream();
  List<Integer>example_list=stream.filter(i->i%2==0).filter(i->i>=3).collect(Collectors.toList());
    
  List<Integer>newlist=list1.stream().filter(i->i%2==1).filter(i->i>=6).collect(Collectors.toList());    
  newlist.stream().forEach(e->{
    System.out.println(e);
  });

  list1.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(e->{
    System.out.println(e);
  });

  list1.stream().filter(i->i%2==0).forEach(e->{
    System.out.println(e);
  });



  //Using Integer Stream called 'IntStream'
  IntStream stream_integer_array = Arrays.stream(new int[]{2,4,65,2113,23});

    stream_integer_array.forEach(e->{
      System.out.println(e*e*e);
    });




  //Using map and filter simultanesouly
  System.out.println("Printing out the cubes from 1 to 5");
  List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,101));
  list2.stream().filter(e->e<100).filter(e->e<6).map(e->e*e*e).collect(Collectors.toList()).forEach(System.out::println);




 System.out.println("Printing the sorted elememtns in ascending and  descending  order.");
 //sort the elements.
    list2.stream().sorted().forEach(System.out::println);
  list2.stream().sorted((x,y)->y.compareTo(x)).forEach(System.out::println);



    System.out.println("Printing the Smallest element");
 //Getting the minimum elements.
    Integer integer = list2.stream().min((x,y)->x.compareTo(y)).get();


    
   
  }
}


