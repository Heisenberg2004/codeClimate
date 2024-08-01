public class OrderProcessor {

    public void processOrder(Order order) {
        if (order == null) {
            System.out.println("Order is null, cannot process");
            return;
        }

        applyRelevantDiscount(order);
        updateOrderStatus(order);

        if (isBulkOrder(order)) {
            order.setStatus(order.getStatus() + " and bulk order");
        }

        sendConfirmationEmail(order);
    }

    private void applyRelevantDiscount(Order order) {
        if (order.getTotalPrice() > 1000) {
            double discountRate = order.isRushOrder() ? 0.1 : 0.05;
            applyDiscount(order, discountRate);
        }
    }

    private void updateOrderStatus(Order order) {
        if (order.isRushOrder()) {
            order.setStatus(order.getTotalPrice() > 1000 ? 
                "Processed with rush and high value discount" : 
                "Processed with rush");
        } else {
            order.setStatus(order.getTotalPrice() > 1000 ? 
                "Processed with high value discount" : 
                "Processed normally");
        }
    }

    private boolean isBulkOrder(Order order) {
        return order.getItems().size() > 10;
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
