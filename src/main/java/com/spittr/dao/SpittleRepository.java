package com.spittr.dao;

import com.spittr.dto.Spittle;

import java.util.List;

public interface SpittleRepository {

    List<Spittle> findSpittles(Long max, int count);

    Spittle findOne(long spittleId);

}
