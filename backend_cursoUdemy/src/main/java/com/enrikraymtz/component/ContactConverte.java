package com.enrikraymtz.component;

import org.springframework.stereotype.Component;

import com.enrikraymtz.entity.Contact;
import com.enrikraymtz.model.ContactModel;

@Component("contactConverte")
public class ContactConverte {
	
	public Contact converteContactModel2Contact(ContactModel contactModel){
		Contact contact = new Contact();
		contact.setCity(contactModel.getCity());
		contact.setFirstname(contactModel.getFirstname());
		contact.setLastname(contactModel.getLastname());
		contact.setTelephone(contactModel.getTelephone());
		contact.setId(contactModel.getId());
		return contact;
	}
	
	public ContactModel converteContact2ContactModel(Contact contact){
		ContactModel contactModel =  new ContactModel();
		contactModel.setCity(contact.getCity());
		contactModel.setTelephone(contact.getTelephone());
		contactModel.setLastname(contact.getLastname());
		contactModel.setFirstname(contact.getFirstname());
		contactModel.setId(contact.getId());
		return contactModel;
	}
	
}
