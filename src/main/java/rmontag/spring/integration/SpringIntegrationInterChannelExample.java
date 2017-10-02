package rmontag.spring.integration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class SpringIntegrationInterChannelExample {
    private MessageChannel orderConfirmationChannel;
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        SpringIntegrationInterChannelExample springIntExample = (SpringIntegrationInterChannelExample) context.getBean("springIntChannelExample");
        springIntExample.postOrder();
    }
    
    public void postOrder() {
        Order emp = new Order(1);
        Message<Order> msg = MessageBuilder.withPayload(emp).build();        
        System.out.println(Thread.currentThread().getName() + " - " + "send message " + msg);
        orderConfirmationChannel.send(msg);
    }

    public void setOrderConfirmationChannel(MessageChannel orderConfirmationChannel) {
        this.orderConfirmationChannel = orderConfirmationChannel;
    }     
}
