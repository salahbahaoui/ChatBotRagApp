package com.balhaoui.ChatBotRagApp.services;

import com.balhaoui.ChatBotRagApp.PersonRepository;
import com.balhaoui.ChatBotRagApp.entities.Person;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;
import com.vaadin.hilla.crud.CrudRepositoryService;

@BrowserCallable
@AnonymousAllowed
public class PersonService extends CrudRepositoryService<Person, Long, PersonRepository> {
}
