package com.example.jpaconverter

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
class EntidadeComMapDeSet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @ElementCollection
    @Convert(converter = StringSetConverter::class, attributeName = "value") // attributeName = key or value
    val mapDeStringExemplo: Map<String, Set<String>>
)

interface EntidadeComMapDeSetRepository : JpaRepository<EntidadeComMapDeSet, Long>
