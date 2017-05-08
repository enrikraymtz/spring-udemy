package com.enrikraymtz.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.enrikraymtz.component.ContactConverte;
import com.enrikraymtz.entity.Contact;
import com.enrikraymtz.model.ContactModel;
import com.enrikraymtz.repository.ContactRepository;
import com.enrikraymtz.service.ContactoService;

@Service("contantServiceImpl")
public class ContactServiceImp implements ContactoService {

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverte")
	private ContactConverte contactConverte;
	
	@Override
	public ContactModel addContacto(ContactModel contactoModel) {
		Contact contact = contactRepository.save(contactConverte.converteContactModel2Contact(contactoModel));
		return contactConverte.converteContact2ContactModel(contact);
	}

	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts =  contactRepository.findAll();
		List<ContactModel> contactsModel = new ArrayList<ContactModel>();
		for(Contact contact : contacts){
			contactsModel.add(contactConverte.converteContact2ContactModel(contact));
		}
		return contactsModel;
	}

	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}
	
	public ContactModel findContactByIdModel(int id){
		return contactConverte.converteContact2ContactModel(findContactById(id));
	}
	
	@Override
	public void removeContat(int id) {
		Contact contact = findContactById(id);
		if(null != contact){
			contactRepository.delete(id);
		}
	}

}
