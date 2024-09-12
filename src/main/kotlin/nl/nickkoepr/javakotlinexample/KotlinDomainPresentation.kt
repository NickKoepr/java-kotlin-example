package nl.nickkoepr.javakotlinexample

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KotlinDomainPresentation(
    val kotlinDomainService: KotlinDomainService
) {

    @GetMapping("/")
    fun test(): KotlinDomain {
        return kotlinDomainService.testingMethod()
    }
}