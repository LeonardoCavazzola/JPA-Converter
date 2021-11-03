package com.example.testaset

import org.springframework.data.jpa.repository.JpaRepository
import javax.persistence.*

//Só converte o Set que ta no map
@Entity
class Exemplo21(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @ElementCollection
    @Convert(converter = StringSetConverter::class, attributeName = "value") // attributeName = key or value
    val mapDeStringExemplo: Map<String, Set<String>>
)

interface Exemplo21Repository : JpaRepository<Exemplo21, Long>