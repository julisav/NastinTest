package by.savelyeva.nastintest.dao;

import java.util.List;

import by.savelyeva.nastintest.domain.Contact;

public interface ContactDAO {

	public void addContact(Contact contact);

	public List<Contact> listContact();

	public void removeContact(Integer id);
}
