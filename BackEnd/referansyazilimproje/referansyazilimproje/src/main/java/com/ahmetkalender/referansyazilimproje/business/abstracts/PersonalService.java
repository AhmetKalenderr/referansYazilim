package com.ahmetkalender.referansyazilimproje.business.abstracts;

import java.util.List;

import com.ahmetkalender.referansyazilimproje.Entities.concretes.Personal;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.DataResult;
import com.ahmetkalender.referansyazilimproje.core.utilities.results.Result;

public interface PersonalService {

	DataResult<List<Personal>>getAll();
	Result add(Personal personal);
}
