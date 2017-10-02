package rmontag.spring.integration;

public class OrderManager {
    public Order billOrder(Order order) {
        System.out.println(Thread.currentThread().getName() + " - " + "Bill Order " + order);
        order.setBilled(true);
        return order;
    }

    public Order updateInventory(Order order) {
        System.out.println(Thread.currentThread().getName() + " - " + "Update inventory for " + order);
        order.setInvUpdated(true);
        return order;
    }

    public void emailOrderConfirmation(Order order) {
        System.out.println(Thread.currentThread().getName() + " - " + "Email order confirmation " + order);
        order.setEmailSent(true);
    }
}
