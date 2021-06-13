package com.ahmetkalender.referansyazilimproje.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmetkalender.referansyazilimproje.Entities.concretes.Personal;

public interface personalDao extends JpaRepository<Personal, Integer> {

}
