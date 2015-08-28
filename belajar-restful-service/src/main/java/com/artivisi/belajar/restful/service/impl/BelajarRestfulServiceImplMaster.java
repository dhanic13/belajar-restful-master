/**
 * Copyright (C) 2011 ArtiVisi Intermedia <info@artivisi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.artivisi.belajar.restful.service.impl;

import com.artivisi.belajar.restful.dao.ProdukDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.artivisi.belajar.restful.domain.master.Produk;
import com.artivisi.belajar.restful.service.BelajarRestfulServiceMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service("belajarRestfulServiceMaster")
@Transactional
public class BelajarRestfulServiceImplMaster implements BelajarRestfulServiceMaster {

    @Autowired
    private ProdukDao produkDao;


    @Override
    public void save(Produk p) {
        produkDao.save(p);
    }

    @Override
    public void delete(Produk p) {
        produkDao.delete(p);
    }

    @Override
    public Produk findProdukByKd(String kd) {
        if(!StringUtils.hasText(kd)){
            return null;
        }
        return produkDao.findOne(kd);
    }

    @Override
    public Produk findProdukByName(String name) {
        if(!StringUtils.hasText(name)){
            return null;
        }
        return produkDao.findByname(name);
    }

    @Override
    public Page<Produk> findAllProduk(Pageable pageable) {
        return produkDao.findAll(pageable);
    }

    @Override
    public Long countAllProduk() {
        return produkDao.count();
    }
}
