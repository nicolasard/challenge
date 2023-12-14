package com.fiserv.interviews.challenge.service;

import com.fiserv.interviews.challenge.entity.TransactionResultVo;
import com.fiserv.interviews.challenge.entity.TransactionVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionalService {

	public List<TransactionVo> findAll() {
		throw new UnsupportedOperationException("Method not implemented");
	}

	public TransactionResultVo process(final TransactionVo transaction) {
		throw new UnsupportedOperationException("Method not implemented");
	}
}
