package com.dio.helloworld;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Sender {

    public static void main(String[] args) throws Exception{

        //primeiro criar a conexão
        ConnectionFactory factory = new ConnectionFactory();

        //setar as informações para cria-la
        factory.setHost("172.19.0.2");
        factory.setUsername("admin");
        factory.setPassword("pass123");
        factory.setPort(5672);
//
//       Connection connection = factory.newConnection();
//       System.out.println(connection.hashCode());

        // criar um novo canal
//        Channel channel = connection.createChannel();
//        System.out.println(channel);

        //declarar a fila que será utilizado

        //criar a mensagem

    }
}
