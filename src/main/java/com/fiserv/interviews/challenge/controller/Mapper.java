package com.fiserv.interviews.challenge.controller;

import com.fiserv.interviews.challenge.entity.TransactionResultVo;
import com.fiserv.interviews.challenge.entity.TransactionVo;
import org.openapitools.model.Transaction;
import org.openapitools.model.TransactionResult;

public class Mapper {

	static TransactionVo map(final Transaction transaction){
		return new TransactionVo(transaction.getTransactionId(), transaction.getStoreID(), transaction.getAmount(), transaction.getTime().toInstant());
	}

	static TransactionResult map(final TransactionResultVo transactionResultVo){
		final TransactionResult transactionResult = new TransactionResult();
		transactionResult.setResult(transactionResultVo.getResult());
		transactionResult.setMessage(transactionResultVo.getMessage());
		return transactionResult;
	}
}
