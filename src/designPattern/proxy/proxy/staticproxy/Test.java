package designPattern.proxy.proxy.staticproxy;


import designPattern.proxy.proxy.Order;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
