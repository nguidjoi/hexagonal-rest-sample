package org.devware.sample.application.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CommonCredentialRequest {
    private String userCode;
    private String currentPassword;
    private String newPassword;
    private String newPasswordConfirmation;
}
