package org.devware.sample.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private int code;
    private String title;
    private String firstName;
    private String lastName;
    private List<String> Roles;
    private List<String> permissions;
    private List<String> groups;
    private boolean certified;
    private boolean activated;
    private String language;
}
