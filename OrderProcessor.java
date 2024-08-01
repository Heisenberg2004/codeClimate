public class OrderProcessor {

    public void processOrder(Order order) {
        if (order != null) {
            if (order.isRushOrder()) {
                if (order.getTotalPrice() > 1000) {
                    applyDiscount(order, 0.1);
                    order.setStatus("Processed with rush and high value discount");
                } else {
                    order.setStatus("Processed with rush");
                }
            } else {
                if (order.getTotalPrice() > 1000) {
                    applyDiscount(order, 0.05);
                    order.setStatus("Processed with high value discount");
                } else {
                    order.setStatus("Processed normally");
                }
            }

            if (order.getItems().size() > 10) {
                order.setStatus(order.getStatus() + " and bulk order");
            }

            sendConfirmationEmail(order);
        } else {
            System.out.println("Order is null, cannot process");
        }
    }

    private void applyDiscount(Order order, double discountRate) {
        double discount = order.getTotalPrice() * discountRate;
        order.setTotalPrice(order.getTotalPrice() - discount);
    }

    private void sendConfirmationEmail(Order order) {
        // Sending email logic
        System.out.println("Confirmation email sent for order: " + order.getId());
    }
}
