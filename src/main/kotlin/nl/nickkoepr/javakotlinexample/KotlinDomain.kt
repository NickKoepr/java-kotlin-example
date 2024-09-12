package nl.nickkoepr.javakotlinexample

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class KotlinDomain(
    val x: JavaValue
) {
    @Id
    @GeneratedValue
    val id: Long = 0

    fun getCombination(): String {
        return "Hello, ${x.inputValue}!"
    }
}