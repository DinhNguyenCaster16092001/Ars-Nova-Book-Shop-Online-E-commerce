package com.arsnova.bookonlineshop.service;


import com.arsnova.bookonlineshop.entity.Author;

import java.util.List;

public interface IAuthorService {
    List<Author> findAll();
}
