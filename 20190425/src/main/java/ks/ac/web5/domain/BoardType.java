package ks.ac.web5.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public enum BoardType {
    notice("aasdf"), free("asdfasdf");

    private String value;

    BoardType(String value) {
        this.value=value;
    }

    public String getValue() {
        return value;
    }

}
