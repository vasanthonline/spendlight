package com.application.spendlight

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpendlightApplication

fun main(args: Array<String>) {
	runApplication<SpendlightApplication>(*args)
}
