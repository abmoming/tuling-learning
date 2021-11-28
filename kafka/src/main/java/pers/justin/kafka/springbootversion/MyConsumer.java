package pers.justin.kafka.springbootversion;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @Author Justin
 * @Create 2021-11-21 14:43
 */
@Component
public class MyConsumer {

    /*@KafkaListener(groupId = "testGroup", topicPartitions = {
            @TopicPartition(topic = "topic1", partitions = {"0", "1"}),
            @TopicPartition(topic = "topic2", partitions = "0",
                    partitionOffsets = @PartitionOffset(partition = "1", initialOffset = "100"))
    }, concurrency = "6")
    // concurrency就是同组下的消费者个数，就是并发消费数，必须小于等于分区总数*/
    @KafkaListener(topics = "my-replicated-topic", groupId = "justinGroup")
    public void listenJustinGroup(ConsumerRecord<String, String> record, Acknowledgment ack) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
        // 手动提交offset
        ack.acknowledge();
    }

    /*// 配置多个消费组
    @KafkaListener(topics = "my-replicated-topic", groupId = "justinGroup")
    public void listenJustinGroup(ConsumerRecord<String, String> record, Acknowledgment ack) {
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
        ack.acknowledge();
    }*/
}
