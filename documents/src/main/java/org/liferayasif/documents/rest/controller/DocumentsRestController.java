package org.liferayasif.documents.rest.controller;

import java.util.Optional;

import org.liferayasif.documents.model.Documents;
import org.liferayasif.documents.repository.DocumentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/documents")
public class DocumentsRestController {

	@Autowired
	private DocumentsRepository documentsRepository;
	
	@GetMapping(value = "/download/id/{id}")
	public Optional<Documents> download(@PathVariable("id") String id) {
		return documentsRepository.findById(id);
	}
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public Documents addNewApplication(@RequestBody Documents documents){
        return documentsRepository.save(documents);
    }
	
}
