package nl.nickkoepr.javakotlinexample

import org.springframework.data.jpa.repository.JpaRepository

interface KotlinDomainRepository : JpaRepository<KotlinDomain, Long>