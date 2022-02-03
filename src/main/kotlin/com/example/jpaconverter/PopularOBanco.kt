package com.example.jpaconverter

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class PopularOBanco {

    @Bean
    fun com(repository: EntidadeComMapDeSetRepository): CommandLineRunner = CommandLineRunner {
        repository.save(
            EntidadeComMapDeSet(
                id = null,
                mapDeStringExemplo = mapOf(
                    Pair("k1", setOf("a1", "b1", "c1")),
                    Pair("k2", setOf("a2", "b2", "c2")),
                    Pair("k3", setOf("a3", "b3", "c3")),
                )
            )
        )

        repository.save(
            EntidadeComMapDeSet(
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
