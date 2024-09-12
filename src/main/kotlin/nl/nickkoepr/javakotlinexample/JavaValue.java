package nl.nickkoepr.javakotlinexample;

import jakarta.persistence.Embeddable;

@Embeddable
public class JavaValue {
    private String inputValue;

    public JavaValue(String inputValue) {
        this.inputValue = inputValue;
    }

    protected JavaValue() {

    }

    public String getInputValue() {
        return inputValue;
    }
}
