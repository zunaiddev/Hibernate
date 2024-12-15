package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Certificate {
    @Column(name = "Certificate_name")
    private String cName;
    private String duration;

    public Certificate() {
    }

    public Certificate(String cName, String duration) {
        this.cName = cName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "cName='" + cName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
