/*
06-July-26
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JimAndTheOrders106 {

    //Helper class to encapsulate customer order information
    static class Order {
       int id;
       int deliveryTime;
       public Order(int id, int orderTime, int prepTime){
        this.id = id;
        this.deliveryTime = orderTime + prepTime;
       }
    }

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
      List<Order> orderList = new ArrayList<>();

      //initialising custom Order objects with 1-based indexing IDs
      for (int i = 0; i < orders.size(); i++) {
        int customerId = i+1;
        int orderTime = orders.get(i).get(0);
        int prepTime = orders.get(i).get(1);
        orderList.add(new Order(customerId, orderTime, prepTime));
      }

      //Sorting using anonymous Comparator
      Collections.sort(orderList, new Comparator<Order>() {
         @Override
         public int compare(Order o1, Order o2){
            // sort by delivery time ascending
            if(o1.deliveryTime != o2.deliveryTime) return o1.deliveryTime - o2.deliveryTime;
            //Tie-breaker sorting using customer Id ascending
            return o1.id - o2.id;
         }
      });

      //extracting the sorted IDs into the final result list
      List<Integer> res = new ArrayList<>();
      for (Order order : orderList) res.add(order.id);
          
      return res;
    }

    public static void main(String[] args) {
        List<List<Integer>> orders = new ArrayList<>(Arrays.asList(
            Arrays.asList(1,3),
            Arrays.asList(2,3),
            Arrays.asList(3,3)
        ));

        System.out.println(jimOrders(orders));
    }
    
}