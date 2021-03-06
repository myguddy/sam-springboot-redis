package com.sam.springboot.springbootredis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * RedisConfig
 */
@Configuration
public class RedisConfig {

    private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);

    // @Value("${spring.redis.host}")
    // private  String redisHost;
    // @Value("${spring.redis.port}")
    // private  int redisPort;

    // @Bean
	// public JedisConnectionFactory connectionFactory() {				
	// 	JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
	// 	jedisConnectionFactory.setHostName(redisHost);
	// 	jedisConnectionFactory.setPort(redisPort);
	// 	jedisConnectionFactory.setUsePool(true);		
	// 	return jedisConnectionFactory;
	// }
	
	// @Bean
	// public RedisTemplate<String, Object> redisTemplate() {
	// 	RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
	// 	redisTemplate.setKeySerializer(new StringRedisSerializer());
	// 	redisTemplate.setValueSerializer(new StringRedisSerializer());
	// 	redisTemplate.setConnectionFactory(connectionFactory());		
	// 	return redisTemplate;
	// }
}