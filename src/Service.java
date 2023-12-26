import entities.Order;
import util.Enum;

import java.util.Date;

public class Service {

    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), Enum.PENDING_PAYMENT);

        System.out.println(order);

        Enum os1 = Enum.DELIVERED;
        Enum os2 = Enum.valueOf("Delivered");
        System.out.println(os1);
        System.out.println(os2);
    }

}
