package com.fiserv.interviews.challenge.entity;

import java.time.Instant;

public class TransactionVo {

	private final String transactionID;

	private final String storeId;

	private final double amount;

	private final Instant time;

	public TransactionVo(final String transactionID, final String storeId, final double amount, final Instant time) {
		this.transactionID = transactionID;
		this.storeId = storeId;
		this.amount = amount;
		this.time = time;
	}

	public String getTransactionID() {
		return this.transactionID;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public double getAmount() {
		return this.amount;
	}

	public Instant getTime() {
		return this.time;
	}
}
