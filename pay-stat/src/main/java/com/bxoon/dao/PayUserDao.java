package com.bxoon.dao;

import com.bxoon.bean.PayUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayUserDao extends JpaRepository<PayUser, Integer> {

}
