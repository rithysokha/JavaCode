//group8
import java.util.HashMap;
public class Exercise2 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> employee0 = new HashMap<>();
            
        employee0.put(0, 0);
        employee0.put(1, 2);
        employee0.put(2, 4);
        employee0.put(3, 3);
        employee0.put(4, 4);
        employee0.put(5, 5);
        employee0.put(6, 8);
        employee0.put(7, 8);
        employee0.put(8, 0);
           
        HashMap<Integer, Integer> employee1 = new HashMap<>();
        employee1.put(0, 1);
        employee1.put(1, 7);
        employee1.put(2, 3);
        employee1.put(3, 4);
        employee1.put(4, 3);
        employee1.put(5, 3);
        employee1.put(6, 4);
        employee1.put(7, 4);
        employee1.put(8, 0);
          
        HashMap<Integer, Integer> employee2 = new HashMap<>();
        employee2.put(0, 2);
        employee2.put(1, 3);
        employee2.put(2, 3);
        employee2.put(3, 4);
        employee2.put(4, 3);
        employee2.put(5, 3);
        employee2.put(6, 2);
        employee2.put(7, 2);
        employee2.put(8, 0);
            
        HashMap<Integer, Integer> employee3 = new HashMap<>();
        employee3.put(0, 3);
        employee3.put(1, 9);
        employee3.put(2, 3);
        employee3.put(3, 4);
        employee3.put(4, 7);
        employee3.put(5, 3);
        employee3.put(6, 4);
        employee3.put(7, 1);
        employee3.put(8, 0);
         
        HashMap<Integer, Integer> employee4 = new HashMap<>();
        employee4.put(0, 4);
        employee4.put(1, 3);
        employee4.put(2, 5);
        employee4.put(3, 4);
        employee4.put(4, 3);
        employee4.put(5, 6);
        employee4.put(6, 3);
        employee4.put(7, 8);
        employee4.put(8, 0);
            
        HashMap<Integer, Integer> employee5 = new HashMap<>();
        employee5.put(0, 5);
        employee5.put(1, 3);
        employee5.put(2, 4);
        employee5.put(3, 4);
        employee5.put(4, 6);
        employee5.put(5, 3);
        employee5.put(6, 4);
        employee5.put(7, 4);
        employee5.put(8, 0);
           
        HashMap<Integer, Integer> employee6 = new HashMap<>();
        employee6.put(0, 6);
        employee6.put(1, 3);
        employee6.put(2, 7);
        employee6.put(3, 4);
        employee6.put(4, 8);
        employee6.put(5, 3);
        employee6.put(6, 8);
        employee6.put(7, 4);
        employee6.put(8, 0);
         
        HashMap<Integer, Integer> employee7 = new HashMap<>();
        employee7.put(0, 7);
        employee7.put(1, 6);
        employee7.put(2, 3);
        employee7.put(3, 5);
        employee7.put(4, 9);
        employee7.put(5, 2);
        employee7.put(6, 7);
        employee7.put(7, 9);
        employee7.put(8, 0);

        for (int i = 1; i < 8; i++) {
            employee0.put(8, employee0.get(8) + employee0.get(i));
            employee1.put(8, employee1.get(8) + employee1.get(i));
            employee2.put(8, employee2.get(8) + employee2.get(i));
            employee3.put(8, employee3.get(8) + employee3.get(i));
            employee4.put(8, employee4.get(8) + employee4.get(i));
            employee5.put(8, employee5.get(8) + employee5.get(i));
            employee6.put(8, employee6.get(8) + employee6.get(i));
            employee7.put(8, employee7.get(8) + employee7.get(i));
        }
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        
                map.put(0, employee0);
                map.put(1, employee1);
                map.put(2, employee2);
                map.put(3, employee3);
                map.put(4, employee4);
                map.put(5, employee5);
                map.put(6, employee6);
                map.put(7, employee7);
          

        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (map.get(j).get(8) > map.get(i).get(8)) {
                    HashMap<Integer, Integer> temp;
                    temp = map.get(i);
                    map.put(i, map.get(j));
                    map.put(j, temp);
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.println("Employee" + map.get(i).get(0) + "  " + map.get(i).get(1)
                    + "  " + map.get(i).get(2) + "  " + map.get(i).get(3) + "  " + map.get(i).get(4)
                    + "  " + map.get(i).get(5) + "  " + map.get(i).get(6) + "  " + map.get(i).get(7) 
                    + "  Total: "+ map.get(i).get(8)+ " hours");
        }

    }

}
