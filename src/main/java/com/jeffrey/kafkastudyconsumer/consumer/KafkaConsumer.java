package com.jeffrey.kafkastudyconsumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class KafkaConsumer {

      @KafkaListener(topics = {"topic-ideal"})
      public void consumer(ConsumerRecord<?, ?> record){
          Optional<?> kafkaMessage = Optional.ofNullable(record.value());
          if (kafkaMessage.isPresent()) {
              Object message = kafkaMessage.get();
              log.info("----------------- record =" + record);
              log.info("------------------ message =" + message);
              System.out.println("----------------- record =" + record);
              System.out.println("------------------ message =" + message);
          }
      }
  }
