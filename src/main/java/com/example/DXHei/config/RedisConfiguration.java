package com.example.DXHei.config;

import com.example.DXHei.utils.FastJsonSerializer;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author XPR
 * @since 2023/9/4 0:20
 */
//@Configuration
public class RedisConfiguration {

//    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();

        template.setConnectionFactory(factory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        template.setKeySerializer(stringRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);

        FastJsonSerializer fastJsonSerializer = new FastJsonSerializer();
        template.setValueSerializer(fastJsonSerializer);
        template.setHashValueSerializer(fastJsonSerializer);

        template.afterPropertiesSet();
        return template;
    }
}
