package nl.nickkoepr.javakotlinexample;

import org.springframework.stereotype.Service;

@Service
public class KotlinDomainService {

    private final KotlinDomainRepository kotlinDomainRepository;

    public KotlinDomainService(KotlinDomainRepository kotlinDomainRepository) {
        this.kotlinDomainRepository = kotlinDomainRepository;
    }


    public KotlinDomain testingMethod() {
        return kotlinDomainRepository.save(new KotlinDomain(new JavaValue("testingg")));
    }
}
