package com.fiserv.interviews.challenge.entity;

import org.openapitools.model.TransactionResult;

public class TransactionResultVo {

	final TransactionResult.ResultEnum result;

	final String message;

	public TransactionResultVo(final TransactionResult.ResultEnum result, final String message) {
		this.result = result;
		this.message = message;
	}

	public TransactionResult.ResultEnum getResult() {
		return this.result;
	}

	public String getMessage() {
		return this.message;
	}
}
