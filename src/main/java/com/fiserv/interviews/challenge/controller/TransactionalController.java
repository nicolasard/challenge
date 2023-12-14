package com.fiserv.interviews.challenge.controller;

import com.fiserv.interviews.challenge.service.TransactionalService;
import org.openapitools.api.TransactionApi;
import org.openapitools.model.Transaction;
import org.openapitools.model.TransactionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;



@RestController
class TransactionalController implements TransactionApi {

	final TransactionalService transactionalService;

	@Autowired
	TransactionalController(final TransactionalService transactionalService) {
		this.transactionalService = transactionalService;
	}

	@Override
	public ResponseEntity<TransactionResult> processTransaction(final Transaction transaction) {
		return new ResponseEntity<>(Mapper.map(this.transactionalService.process(Mapper.map(transaction))), HttpStatus.OK);
	}
}
