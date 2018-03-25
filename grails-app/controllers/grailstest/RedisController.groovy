package grailstest

import redis.clients.jedis.Jedis

class RedisController {

    def redisService

    def index() {
        redisService.withRedis { Jedis redis ->
            final keys = redis.keys('tabel:*')
            log.debug keys.toListString()
        }

        render 'OK'
    }

}
