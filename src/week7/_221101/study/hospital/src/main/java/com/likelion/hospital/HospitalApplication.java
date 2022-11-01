package com.likelion.hospital;

import com.likelion.hospital.context.ReadLineContext;
import com.likelion.hospital.dao.HospitalDao;
import com.likelion.hospital.domain.Hospital;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class HospitalApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context = SpringApplication.run(HospitalApplication.class, args);
		ReadLineContext<Hospital> hospitalReadLineContext = (ReadLineContext<Hospital>) context.getBean("hospitalReadLineContext");
		HospitalDao hospitalDao = context.getBean(HospitalDao.class);
		List<Hospital> hospitals = hospitalReadLineContext.readByLine("fulldata.txt");
		for (Hospital hospital : hospitals) {
			hospitalDao.insert(hospital);
		}
	}

}
