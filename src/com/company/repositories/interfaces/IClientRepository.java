package com.company.repositories.interfaces;

import com.company.entities.Clients;

public interface IClientRepository {
    Clients clientSignIn(String login, String password);
    Clients clientCheck(String login);

    boolean addClient(Clients client);

    Clients getClient();
}
