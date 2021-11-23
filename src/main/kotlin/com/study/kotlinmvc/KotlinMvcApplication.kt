package com.study.kotlinmvc

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.sql.DriverManager.println
import javax.annotation.PostConstruct

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class KotlinMvcApplication{
    @Value("\${my-app.welcome-message}")
    val myAppWelcomeMessage: String = ""

    @PostConstruct
    fun printMyAppWelcomeMessage() {
        println(myAppWelcomeMessage)
    }


}

fun main(args: Array<String>) {
    runApplication<KotlinMvcApplication>(*args)
}
