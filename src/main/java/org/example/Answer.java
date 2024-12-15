package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
    @Id
    @Column(name = "Answer_id")
    private int ansId;

    @Column(name = "Answer")
    private String ans;

    public Answer() {
    }

    public Answer(int ansId, String ans) {
        this.ansId = ansId;
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Answer!" +
                "ansId: " + ansId +
                "\nans: " + ans;
    }
}
