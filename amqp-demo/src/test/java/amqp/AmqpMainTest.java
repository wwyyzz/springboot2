package amqp;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AmqpMainTest {

    @Autowired
    AmqpAdmin amqpAdmin;


    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    void createExchange() {
        Queue queue = new Queue("hello-java-queue",true,false,false);
        amqpAdmin.declareQueue(queue);

    }

    @Test
    void createQueue() {
        DirectExchange directExchange = new DirectExchange("hello-java-exchange",true,false);

        amqpAdmin.declareExchange(directExchange);

    }

    @Test
    void createBinding() {
        Binding binding = new Binding("hello-java-queue",
                Binding.DestinationType.QUEUE,
                "hello-java-exchange",
                "hello.java",
                null);
        amqpAdmin.declareBinding(binding);

    }

    @Test
    public void SendMessage() {
        for (int i = 0; i < 10; i++) {
            rabbitTemplate.convertAndSend("hello-java-exchange","hello.java","hello world" + i);
        }

    }

}