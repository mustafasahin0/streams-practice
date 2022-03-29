package com.example.streampracticetask.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Region {

    private Long id;
    private String regionName;

    @Override
    public String toString() {
        return "{" + id + ", " + regionName + "}";
    }

}
