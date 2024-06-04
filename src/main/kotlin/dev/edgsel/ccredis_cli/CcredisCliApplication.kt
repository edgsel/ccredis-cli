package dev.edgsel.ccredis_cli

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CcredisCliApplication

fun main(args: Array<String>) {
	runApplication<CcredisCliApplication>(*args)
}
