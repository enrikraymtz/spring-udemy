package com.enrikraymtz.service;

import java.util.List;

import com.enrikraymtz.entity.Contact;
import com.enrikraymtz.model.ContactModel;

public interface ContactoService {
	
	public abstract ContactModel addContacto(ContactModel contactoModel);
	
	public abstract List<ContactModel> listAllContacts();
	
	public abstract Contact findContactById(int id);
	
	public abstract void removeContat(int id);
	
	public abstract ContactModel findContactByIdModel(int id);
	
}
