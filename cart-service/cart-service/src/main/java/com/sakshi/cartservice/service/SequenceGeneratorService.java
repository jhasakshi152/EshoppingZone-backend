package com.sakshi.cartservice.service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.sakshi.cartservice.entity.DatabaseSequence;


@Service
public class SequenceGeneratorService {

	@Autowired
	private MongoOperations mongoOperations;

	public long generateSequence(String seqName) {

		// get sequence no
		Query query = new Query(Criteria.where("id").is(seqName));
		// update the sequence no
		Update update = new Update().inc("seq", 1);
		// modify in document
		DatabaseSequence counter = mongoOperations.findAndModify(query, update, options().returnNew(true).upsert(true),
				DatabaseSequence.class);

		return !Objects.isNull(counter) ? counter.getSeq() : 1;

	}
}
