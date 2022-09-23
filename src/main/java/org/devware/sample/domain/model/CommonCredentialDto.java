package org.devware.sample.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CommonCredentialDto {
    private String userCode;
    private String currentPassword;
    private String newPassword;
    private String newPasswordConfirmation;
}
