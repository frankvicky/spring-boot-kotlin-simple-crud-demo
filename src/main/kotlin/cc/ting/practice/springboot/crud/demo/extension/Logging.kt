package cc.ting.practice.springboot.crud.demo.extension
import org.slf4j.Logger
import org.slf4j.LoggerFactory.*

interface Logging {
    fun <T: Logging> T.logger(): Logger = getLogger(javaClass)
}