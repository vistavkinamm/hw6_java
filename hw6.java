import java.util.HashMap;
//Разработать программу, имитирующую поведение коллекции HashSet. 
//В программе содать метод add добавляющий элемент, и метод позволяющий 
//выводить эллементы коллекции в консоль. Формат данных Integer.

public class hw6 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) {
       add(44); 
       add(89);
       add(33);
       add(55);
       add(77);
       //System.out.println(hMap.keySet());    
       //System.out.println(getString());

       System.out.println(gettKey(0));
       System.out.println(gettKey(100));

    }

    //private static String getString(){
        //return hMap.keySet().toString();
    //}

    private static int gettKey(int num){
        return (Integer)hMap.keySet().toArray()[num];
    }    
    
   
    public static void add(Integer num) {
        hMap.put(num, OBJECT);        
    }
}