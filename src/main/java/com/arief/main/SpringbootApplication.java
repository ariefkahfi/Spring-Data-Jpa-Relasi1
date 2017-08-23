package com.arief.main;

import com.arief.Repositories.KelasRepo;
import com.arief.Repositories.MapelRepo;
import com.arief.Repositories.MuridRepo;
import com.arief.Repositories.WaliKelasRepo;
import com.arief.entity.Kelas;
import com.arief.entity.Mapel;
import com.arief.entity.Murid;
import com.arief.entity.WaliKelas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.Map;

@SpringBootApplication
@EntityScan("com.arief.entity")
@EnableJpaRepositories("com.arief.Repositories")
public class SpringbootApplication implements CommandLineRunner{


	@Autowired
	private MapelRepo mapelRepo;
	@Autowired
	private MuridRepo muridRepo;
	@Autowired
	private WaliKelasRepo waliKelasRepo;
	@Autowired
	private KelasRepo kelasRepo;


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {

	}
}
