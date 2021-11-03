package com.example.testaset

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PopularOBanco {

    @Bean
    fun com(exemplo21Repository: Exemplo21Repository): CommandLineRunner = CommandLineRunner {
        exemplo21Repository.save(
            Exemplo21(
                id = null,
                mapDeStringExemplo = mapOf(
                    Pair("k1", setOf("a1", "b1", "c1")),
                    Pair("k2", setOf("a2", "b2", "c2")),
                    Pair("k3", setOf("a3", "b3", "c3")),
                )
            )
        )

        exemplo21Repository.save(
            Exemplo21(
                id = null,
                mapDeStringExemplo = mapOf(
                    Pair("k1", setOf("a1", "b1", "c1")),
                    Pair("k2", setOf("a2", "b2", "c2")),
                    Pair("k3", setOf("a3", "b3", "c3")),
                )
            )
        )
    }
}