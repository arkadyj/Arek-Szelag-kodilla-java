package com.kodilla.hibernate.elemlecz.dao;

import com.kodilla.hibernate.elemlecz.WykElecz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface WykEleczDao extends CrudRepository<WykElecz, Integer> {
}
