package com.fiserv.interviews.challenge;

import com.fiserv.interviews.challenge.entity.TransactionVo;
import com.fiserv.interviews.challenge.service.FraudService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Instant;

@SpringBootTest
class FraudServiceTest {

	final FraudService fraudService;

	@Autowired
	FraudServiceTest(final FraudService fraudService) {
		this.fraudService = fraudService;
	}

	@Test
	void shouldNotFlagAsFraud() {
		final TransactionVo transaction = new TransactionVo("TID","Store Name",100, Instant.parse("2023-12-03T10:15:30.00Z"));
		final boolean isFraud = this.fraudService.isFraud(transaction);
		Assertions.assertFalse(isFraud);
	}

	@Test
	void shouldNotFlagAsFraudAtNightTime() {
		final TransactionVo transaction = new TransactionVo("TID","Store Name",100, Instant.parse("2023-12-03T01:15:30.00Z"));
		final boolean isFraud = this.fraudService.isFraud(transaction);
		Assertions.assertFalse(isFraud);
	}

	@Test
	void shouldNotFlagAsFraudAtHightAmount() {
		final TransactionVo transaction = new TransactionVo("TID","Store Name",1000, Instant.parse("2023-12-03T12:15:30.00Z"));
		final boolean isFraud = this.fraudService.isFraud(transaction);
		Assertions.assertFalse(isFraud);
	}

	@Test
	void shouldFlagAsFraud() {
		final TransactionVo transaction = new TransactionVo("TID","Store Name",10, Instant.parse("2023-12-03T12:15:30.00Z"));
		final boolean isFraud = this.fraudService.isFraud(transaction);
		Assertions.assertFalse(isFraud);
	}

}
