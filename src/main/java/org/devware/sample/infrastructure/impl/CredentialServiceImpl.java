package org.devware.sample.infrastructure.impl;

import org.devware.sample.domain.model.CreateCredentialDto;
import org.devware.sample.domain.model.DeleteCredentialDto;
import org.devware.sample.domain.model.UpdateCredentialDto;
import org.devware.sample.domain.model.UserCredential;
import org.devware.sample.domain.service.CredentialService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CredentialServiceImpl implements CredentialService {


    @Override
    public Optional<UserCredential> createCredential(CreateCredentialDto credentialDto) {
        return Optional.empty();
    }

    @Override
    public Optional<UserCredential> updateCredential(UpdateCredentialDto updateCredentialDto) {
        return Optional.empty();
    }

    @Override
    public Optional<Boolean> deleteCredential(DeleteCredentialDto deleteCredentialDto) {
        return Optional.empty();
    }

    @Override
    public Optional<UserCredential> readCredential() {
        return Optional.empty();
    }
}
