package com.theoddseagulls.segapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Livrable3Test {

    //To Complete (2 tests)
    @Test
    public void checkProviderType() {
        ProviderAccount providerAccount = new ProviderAccount("test@provider.com", "secret");
        assertEquals("Check the type of the Provider", "Fournisseur",  providerAccount.getType());
    }
    @Test
    public void checkAddProviderAvailabilities() {
        AdminAccount.getTheaccount("test@email.com", "secret");
        Account anAdminAccount = AdminAccount.getTheaccount();
        assertEquals("Check the email of the admin", "test@email.com",  anAdminAccount.getEmail());
    }
    @Test
    public void checkProviderMandatoryFields() {
        ProviderAccount providerAccount = new ProviderAccount("test@provider.com", "secret");
        assertEquals("Check the type of the Provider", "Fournisseur",  providerAccount.getType());
    }
}
