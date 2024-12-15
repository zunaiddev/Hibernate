package org.example;

import jakarta.persistence.*;

@Entity
public class Question {
    @Id
    @Column(name = "Question_id")
    private int quId;

    @Column(name = "Question")
    private String qu;

    //@OneToOne // needs to manually save answer obj first
    @OneToOne(cascade = CascadeType.ALL)// Auto save answer Obj
    @JoinColumn(name = "Answer_id")
    private Answer answer;

    public Question() {
    }

    public Question(int quId, String qu, Answer answer) {
        this.quId = quId;
        this.qu = qu;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question!" +
                "quId: " + quId +
                "\nquestion: " + qu + "\n" + answer.toString();
    }
}
