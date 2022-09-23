package org.devware.sample.application;

import org.devware.sample.application.request.UpdateCredentialRequest;
import org.devware.sample.domain.model.UserCredential;
import org.devware.sample.domain.service.CredentialService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/credential")
public class UserCredentialController {

    CredentialService userCredentialService;

    @PutMapping()
    @PreAuthorize("hasAnyAuthority('UPDATE_CREDENTIAL')")
    Mono<UserCredential> update(UpdateCredentialRequest updateCredentialRequest) {
        return Mono.justOrEmpty(userCredentialService.updateCredential());
    }

    @PostMapping()
    @PreAuthorize("hasAnyAuthority('CREATE_CREDENTIAL')")
    Mono<UserCredential> create(UpdateCredentialRequest updateCredentialRequest) {
        return Mono.justOrEmpty(userCredentialService.createCredential());
    }

    @GetMapping()
    @PreAuthorize("hasAnyAuthority('READ_CREDENTIAL')")
    Mono<UserCredential> get(){
        return Mono.justOrEmpty(userCredentialService.readCredential());
    }

    @DeleteMapping()
    @PreAuthorize("hasAnyAuthority('DELETE_CREDENTIAL')")
    Mono<Boolean> delete(){
        return Mono.justOrEmpty(userCredentialService.deleteCredential());
    }

}
