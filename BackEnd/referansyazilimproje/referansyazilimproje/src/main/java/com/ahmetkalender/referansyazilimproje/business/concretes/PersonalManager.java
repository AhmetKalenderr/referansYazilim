package com.ahmetkalender.referansyazilimproje.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ahmetkalender.referansyazilimproje.Entities.concretes.Personal;
import com.ahmetkalender.referansyazilimproje.business.abstracts.PersonalService;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.DataResult;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.Result;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.SuccessDataResult;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.SuccessResult;
import com.ahmetkalender.referansyazilimproje.dataaccess.abstracts.personalDao;

@Service
public class PersonalManager implements PersonalService {
	
	private personalDao personaldao;

	public PersonalManager(personalDao personaldao) {
		super();
		this.personaldao = personaldao;
	}

	@Override
	public DataResult<List<Personal>> getAll() {
		return new SuccessDataResult<List<Personal>>
		("Kişiler getirildi",this.personaldao.findAll());
	}

	@Override
	public Result add(Personal personal) {
		this.personaldao.save(personal);
		return new SuccessResult("Kişi eklendi");
		
	}

}
