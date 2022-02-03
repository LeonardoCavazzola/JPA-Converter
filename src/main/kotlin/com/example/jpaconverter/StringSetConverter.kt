package com.example.jpaconverter

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class StringSetConverter : AttributeConverter<Set<String>, String> {

    companion object {
        const val SPLIT_CHAR = ";"
    }

    override fun convertToDatabaseColumn(strings: Set<String>): String =
        strings.joinToString(separator = SPLIT_CHAR)

    override fun convertToEntityAttribute(dbData: String): Set<String> =
        dbData.split(SPLIT_CHAR).toSet()
}

@Converter
class StringSetConverterJson : AttributeConverter<Set<String>, String> {

    override fun convertToDatabaseColumn(attribute: Set<String>?): String =
        ObjectMapper().writeValueAsString(attribute)

    override fun convertToEntityAttribute(dbData: String?): Set<String> =
        ObjectMapper().readValue("json", object : TypeReference<Set<String>>() {})
}
