package com.example.jpaconverter

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

@Entity
class EntidadeSoComSet(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Convert(converter = StringSetConverter::class)
    val setDeStringExemplo: Set<String>
)

interface EntidadeSoComSetRepository : JpaRepository<EntidadeSoComSet, Long>
