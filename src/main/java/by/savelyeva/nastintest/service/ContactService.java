package by.savelyeva.nastintest.service;

import java.util.List;

import by.savelyeva.nastintest.domain.Contact;

public interface ContactService {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
