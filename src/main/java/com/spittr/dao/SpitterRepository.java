package com.spittr.dao;

import com.spittr.dto.Spitter;

public interface SpitterRepository {

    public void save(Spitter spitter);

    Spitter findByUsername(String username);

}
