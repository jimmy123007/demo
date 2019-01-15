package cn.gogo.jedis;

import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
* @author 郭明
* @date 2016年2月2日上午9:47:04
* @version 1.0
*/
public class JedisTest {
	@Test
	public void testJedis() throws Exception {
		//创建Jedis对象
		Jedis jedis = new Jedis("192.168.246.128", 6379);
		//向redis中添加key
		jedis.set("jedis-test", "12345");
		//取key的值
		String result = jedis.get("jedis-test");
		System.out.println(result);
		jedis.close();
	}

}
