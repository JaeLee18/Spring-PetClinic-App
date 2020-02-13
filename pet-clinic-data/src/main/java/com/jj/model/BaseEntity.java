package com.jj.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    // Box Type preferred
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
