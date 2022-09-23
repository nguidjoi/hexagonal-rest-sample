package org.devware.sample.domain.service;

import org.devware.sample.domain.model.CreateCredentialDto;
import org.devware.sample.domain.model.DeleteCredentialDto;
import org.devware.sample.domain.model.UpdateCredentialDto;
import org.devware.sample.domain.model.UserCredential;

import java.util.Optional;

public interface CredentialService {
    Optional<UserCredential>  createCredential(CreateCredentialDto credentialDto);
    Optional<UserCredential>  updateCredential(UpdateCredentialDto updateCredentialDto);
    Optional<Boolean>  deleteCredential(DeleteCredentialDto deleteCredentialDto);
    Optional<UserCredential> readCredential();
}
